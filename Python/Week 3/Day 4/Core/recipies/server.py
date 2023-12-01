from flask import Flask, render_template, request, session, redirect # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
from flask_app.controllers import users
from flask_app.controllers import recipes








if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.