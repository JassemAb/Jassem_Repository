from flask import Flask, render_template, request, session
app = Flask(__name__)
app.secret_key="rod_belek"
DATABASE="recipes_schema"