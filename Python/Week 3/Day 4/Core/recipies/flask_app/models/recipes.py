from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash
from flask_app.models import user_model

class Recipe:
    def __init__(self,data):
        self.id=data["id"]
        self.user_id=data["user_id"]
        self.name=data["name"]
        self.instructions=data["instructions"]
        self.date_made=data["date_made"]
        self.under_30=data["under_30"]
        self.description=data["description"]
        self.poster=user_model.User.get_by_id({'id':self.user_id})
        
    
    @classmethod
    def create(cls,data):
        query="""INSERT INTO recipes 
                            (user_id,name,instructions,date_made,under_30,description)
                            VALUES (%(user_id)s,%(name)s,%(instructions)s,%(date_made)s,%(under_30)s,%(description)s);"""
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def get_all(cls):
        query="""SELECT * FROM recipes;"""
        results=connectToMySQL(DATABASE).query_db(query)
        all_recipes=[]
        for row in results:
            all_recipes.append(cls(row))
        return all_recipes
    
    @classmethod
    def get_by_id(cls,data):
        query="""SELECT * FROM recipes WHERE id=%(id)s;"""
        result=connectToMySQL(DATABASE).query_db(query,data)
        if result:
            return cls(result[0])
        return None
    
    @classmethod
    def update(cls,data):
        print("🐝"*10, data,"🐝"*10)
        query=""" UPDATE recipes SET name=%(name)s,instructions=%(instructions)s,date_made=%(date_made)s,
                under_30=%(under_30)s,description=%(description)s WHERE id=%(id)s; """
        return connectToMySQL(DATABASE).query_db(query,data)
    @classmethod
    def destroy(cls,data):
        query="""DELETE FROM recipes WHERE id=%(id)s;"""
        return connectToMySQL(DATABASE).query_db(query,data)
            
    @staticmethod
    def validate(data):
        is_valid=True
        if len(data['name'])<3:
            is_valid=False
            flash(" recipe name is required")
        if len(data['instructions'])<3:
            is_valid=False
            flash("recipe instructions is required")
        if len(data['description'])<3:
            is_valid=False
            flash("recipe description must be at least 10")
        if (data['date_made'])=="":
            is_valid=False
            flash("recipe Date must be provided")
        return is_valid