from flask import flash
from flask_app import DATABASE
from flask_app.config.mysqlconnection import connectToMySQL


class Party:
    def __init__(self, data_dict):
        self.id = data_dict["id"]
        self.user_id = data_dict["user_id"]
        self.id = data_dict["id"]
        self.id = data_dict["id"]
        self.id = data_dict["id"]
        self.id = data_dict["id"]
        self.id = data_dict["id"]

    @classmethod
    def create(cls, data):
        query = """ INSERT INTO parties
                                    (user_id, title, location, date, all_ages, description)
                            VALUES
                                    (%(user_id)s, %(title)s, %(location)s,
                                    %(date)s, %(all_ages)s, %(description)s);
"""
        return connectToMySQL(DATABASE).query_db(query, data)
    

    @classmethod
    def get_all(cls):
        query = "SELECT * FROM parties;"
        results = connectToMySQL(DATABASE).query_db(query)
        all_parties = []
        for row in results:
            all_parties.append(cls(row))
        return all_parties
    
    @classmethod 
    def get_by_id(cls):
        query = "SELECT * FROM parties WHERE id =%(id)s;"
        results = connectToMySQL(DATABASE).query_db(query, data)
        if results:
            return cls(results[0])
        return None
    
    @classmethod
    def get_user_parties(cls, data):
        query = """ SELECT * FROM parties WHERE user_id=%(user_id)s;"""
results = connectToMySQL(DATABASE).query_db(query, data)
        user_parties = []
        for row in results:
            return user_parties.append(cls(row))
        return user_parties
    
    @classmethod
    def update(cls, data):
        query = """ UPDATE parties SET title = %(title)s , location = %(location)s
        , date = %(date)s , all_ages = %(all_ages)s,
        description = %(description)s
        WHERE ID + %(id)s
        """

        return connectToMySQL(DATABASE).query_db(query, data)
    # DESTROY
    @classmethod
    def destroy(cls, data):
        query = """DELETE FROM parties WHERE id = %(id)s;"""
        return connectToMySQL(DATABASE).query_db(query, data)