import re    # the regex module
from flask import flash
from flask_app import DATABASE
from flask_app.config.mysqlconnection import connectToMySQL




#  create a regular expression object that we'll use later
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')

class User:
    def __init__(self, data_dict):
        self.id = data_dict["id"]
        self.first_name = data_dict["first_name"]
        self.last_name = data_dict["last_name"]
        self.email = data_dict["email"]
        self.password = data_dict["password"]

    #  CRUD Queries == classmethods

    @classmethod
    def create(cls, data):
        query = """INSERT INTO users 
                                (first_name , last_name , email , password)
                            VALUES
                               (%(first_name)s , %(last_name)s , %(email)s , %(password)s) 
                                """
        
        return connectToMySQL(DATABASE).query_db(query, data)
    @classmethod
    def get_by_id(cls, data):
        query = """SELECT * FROM users WHERE id=%(id)s;"""
        result = connectToMySQL(DATABASE).query_db(query, data)
        if result:
            return cls(result[0])
        return None
    
    @classmethod
    def get_by_email(cls, data):
        query = """SELECT * FROM users WHERE id=%(id)s;"""
        result = connectToMySQL(DATABASE).query_db(query, data)
        if result:
            return cls(result[0])
        return False 
    
    @staticmethod
    def validate(data):
        is_valid = True
        # First Name
        if len(data['first_name'])<2:
            is_valid = False
            flash("first name must be greater than 2 characters", "register")
        if len(data['last_name'])<2:
            is_valid = False
            flash("last name must be greater than 2 characters", "register")

        if not EMAIL_REGEX.match(data["email"]):
            flash("Invalid email adress!")
            is_valid = False

        if User.get_by_email({'email' : data['email']}):
            flash("Email already in use, hope by you.", "register")
            is_valid = False
        
        if len(data['password'])<6:
            flash("Password too short", "register")
            is_valid = False

        elif data["password"] != data["confirm_pw"]:
            flash("Password must match.", "register")
            is_valid = False
        return is_valid 
