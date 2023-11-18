from flask import Flask, render_template  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"







# @app.route('/')          # The "@" decorator associates this route with the function immediately following
# def hello_world():
#     return 'Hello World!'  # Return the string 'Hello World!' as a response



@app.route('/')
def indx():
    return render_template("index.html",row=8,col=8,color_one='red',color_two='black')

@app.route('/4')
def index():
    return render_template("index.html", row=8,col=4,color_one='red',color_two='black')

@app.route('/<int:x>/<int:y>')
def repeat(x,y):
    return render_template("index.html", row=x, col=y, color_one='red',color_two='black')

@app.route('/<int:x>/<int:y>/<color1>/<color2>')
def col(x,y,color1,color2):
    return render_template("index.html",row=x,col=y,color_one=color1,color_two=color2)







if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

