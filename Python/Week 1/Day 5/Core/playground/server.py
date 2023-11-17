from flask import Flask, render_template # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"


@app.route('/') 
def index():
    return render_template("index.html")



@app.route('/square/<color>/<int:number>')
def square(color, number):
    return render_template("index.html", color=color, number=number)











 # Return the string 'Hello World!' as a response
if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

