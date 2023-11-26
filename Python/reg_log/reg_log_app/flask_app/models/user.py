from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
import re	# the regex module
# create a regular expression object that we'll use later   
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')

class User:
    def __init__(self, data_dict):
        self.id = data_dict['id']
        self.first_name = data_dict['first_name']
        self.last_name = data_dict['last_name']
        self.email = data_dict['email']
        self.password = data_dict['password']
        self.created_at = data_dict['created_at']
        self.updated_at = data_dict['updated_at']

    # Queries = classmethods

    @classmethod
    def create(cls, data):
        query = """
                INSERT INTO log_reg_db.users
                        (first_name, last_name, email, password)
                    VALUES
                        (%(first_name)s, %(last_name)s, %(email)s, %(password)s)"""
        # INSERT STATEMENT RETURNS NEW INSERTED ID
        db_result= connectToMySQL(DATABASE).query_db(query, data)
        print("INSERT STATEMENT RETURN : ", db_result,"*"*25)
        return db_result
    
    @staticmethod
    def validate(data):
        is_valid= True
        if len(data['first_name'])<2:
            is_valid=False
        if len(data['last_name'])<2:
            is_valid=False
        if not EMAIL_REGEX.match(data['email']):
            is_valid=False
        if len(data['password'])<8:
            is_valid = False
        elif data ['password']!= data['confirm_password']:
            is_valid = False
        return is_valid