from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"









@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response


@app.route('/dojo')          # The "@" decorator associates this route with the function immediately following
def hello_dojo():
    return 'dojo!' 



@app.route('/say/<name>')          # The "@" decorator associates this route with the function immediately following
def hello_flask(name):
    return f'Hi {name}!' 

@app.route('/repeat/<int:number>/<world>')
def repeat(number, world):
    return f'<h2>{world}</h2>'*number














if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

