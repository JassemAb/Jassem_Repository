from flask_app import app
from flask import render_template, redirect, request, flash, session
from flask_app.models.user import User
from flask_bcrypt import Bcrypt

bcrypt = Bcrypt(app)




@app.route("/")
def home():
    return render_template("index.html")


@app.route('/register', methods=['post'])
def home():
    if User.validate(request.form):
        pw_hash = bcrypt.generate_password_hash(request.form['password'])
        data = {
            **request.form,
            'password':pw_hash
        }
        user_id = User.create(data)
        session['user_id'] = user_id
        return redirect('/dashboard')
    return redirect("/")

@app.route('/login', methods=['post'])
def login():
    user_from_db = User.get_by_email({'email': request.form['email']})
    if not user_from_db:
        flash("Email doesn't exist . try to register first", "login")
        return redirect('/')
    if not bcrypt.check_password_hash(user_from_db.password, request.form["password"]):
        flash("Password wrong please try again.", "login")
        return

@app.route("/dashboard")
def dashboard():
    if not "user-id" in session:
        return redirect("/")
    return render_template("dashboard.html")