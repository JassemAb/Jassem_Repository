from flask import Flask, render_template, request, redirect, session  # Import Flask to allow us to create our app

app = Flask(__name__)    # Create a new instance of the Flask class called "app"
app.secret_key = 'keep it secret, keep it safe'


@app.route('/' , methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        session['name'] = request.form['name']
        session['DojoLocation'] = request.form['DojoLocation']
        session['DojoLocation'] = request.form['DojoLocation']
        session['FavoriteLanguage'] = request.form['FavoriteLanguage']
        return redirect('/result')
    return render_template('index.html')

@app.route('/result')
def result():
    return render_template('index.html')
# @app.route('/')          # The "@" decorator associates this route with the function immediately following
# def hello_world():
#     return 'Hello World!'  # Return the string 'Hello World!' as a response

if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True, port=5003)    # Run the app in debug mode.

