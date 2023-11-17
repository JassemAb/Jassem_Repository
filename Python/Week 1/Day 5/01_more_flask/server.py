#http://127.0.0.1/ 
from flask import Flask, render_template 
app = Flask(__name__)
@app.route('/') 
def index():     
    users = [        
        {'name':'John','age':35},
        {'name':'Sarah','age':25},         
        {'name':'Alex','age':28},         
        {'name':'Amelia','age':23},         
        {'name':'James','age':22},         
        {'name':'Eric','age':56}    
        ]     
    return render_template("index.html", users = users) 
    

#http://127.0.0.1/
@app.route('/circles/<color>/<int:number>')
def circles(color, number):
    return render_template("circles.html", color=color, number=number)


    if name=="main":     
        app.run(debug=True,port = 5001)