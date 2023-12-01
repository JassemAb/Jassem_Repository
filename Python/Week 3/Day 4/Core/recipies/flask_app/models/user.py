from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash
import re
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$') 

class User:
    def __init__(self,data):
        self.id=data["id"]
        self.first_name=data["first_name"]
        self.last_name=data["last_name"]
        self.email=data["email"]
        self.password=data["password"]
    
    @classmethod
    def create(cls,data):
        query="""INSERT INTO users 
                            (first_name,last_name,email,password)
                            VALUES (%(first_name)s,%(last_name)s,%(email)s,%(password)s)"""
        return connectToMySQL(DATABASE).query_db(query,data)
    @classmethod
    def get_by_id(cls,data):
        query="""SELECT * FROM users WHERE id=%(id)s"""
        result=connectToMySQL(DATABASE).query_db(query,data)
        if result:
            return cls(result[0])
        return None
    @classmethod
    def get_by_email(cls,data):
        query="""SELECT * FROM users WHERE email=%(email)s"""
        result=connectToMySQL(DATABASE).query_db(query,data)
        if result:
            return cls(result[0])
        return False
    @staticmethod
    def validate(data):
        is_valid=True
        # first & lastname validation
        if len(data["first_name"])<2:
            is_valid=False
            flash("First Name must contains 2 characters minimum ","register")
        if len(data["last_name"])<2:
            is_valid=False
            flash("last Name must contains 2 characters minimum ","register")
        # email validation
        # email pattern:regex
        if not EMAIL_REGEX.match(data['email']):
            flash("invalid email address","register")
            is_valid=False
        #email must be unique
        if User.get_by_email({'email':data['email']}):
            flash("Email already in use, hope by you","register")
            is_valid=False
        #password
        # password length
        if len(data["password"])<6:
            flash("Password too short","register")
            is_valid=False
        # compare password and confirm password
        elif data["password"]!=data["confirm_pw"]:
            flash("Password must match","register")
            is_valid=False
        return is_valid