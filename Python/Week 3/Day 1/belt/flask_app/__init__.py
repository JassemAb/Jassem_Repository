from flask import Flask

app = Flask(__name__)
app.secret_key = "Stay safe"
DATABASE = "belt_demo_db"