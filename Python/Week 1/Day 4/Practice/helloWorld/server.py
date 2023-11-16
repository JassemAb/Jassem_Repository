from flask import Flask
app = Flask(__name__)

# http://127.0.0.1/
@app.route('/')
def hello_world():
    return 'Hello World!'
# http://127.0.0.1/hello
@app.route('/hello')
def hello():
    return "Hello From Server🚀🚀🚀"

# http://127.0.0.1/hello/user
@app.route('/hello/user')
def say_hello():
    return "<h1>Hello James 😁😁😁<h1>"

# http://127.0.0.1/hello/user/<username>
@app.route('/hello/user/<username>/')
def say_hello_username(username):
    return f"<h1>Hello {username} 😁😁😁<h1>"

# http://127.0.0.1/hello/user/<username>/<times>
@app.route('/hello/user/<username>/<int:times>')
def say_hello_username2(username, times):
    return f"<h1>Hello {username} 😁😁😁<h1>" * times

# http://127.0.0.1/user/<username>/<age>
# @app.route('/user/<username>/<int:age>')
# def user_info(username, age):
#     return f"<h1>USERNAME : {username} <br/> AGE : {age} </h1>

# http://127.0.0.1/index
@app.route('/index/<username>/<int:age>')
def index(username, age):
    user = [
        {'name':"John", 'age':"35"},
        {'name':"Sarah", 'age':"25"},
        {'name':"Alex", 'age':"28"},
        {'name':"Amelia", 'age':"23"},
        {'name':"James", 'age':"22"}
    ]
    return render_template("index.html" , user = username, number = age, users=users)


if __name__=="__main__":
    app.run(debug=True, port=1337)

