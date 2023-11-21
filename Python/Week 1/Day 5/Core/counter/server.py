from flask import Flask, render_template ,session, redirect  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
app.secret_key="jassem"




@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    if 'counter' not in session:
        session['counter']=0
    else:
        session['counter']+=1
    return  render_template("counter.html")  # Return the string 'Hello World!' as a response

@app.route('/destroy_session', methods=['POST'])
def  destroy():
    session.clear()
    return redirect('/')

@app.route('/add2')
def add2():
    session['counter']+=0
    return redirect('/')








if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

