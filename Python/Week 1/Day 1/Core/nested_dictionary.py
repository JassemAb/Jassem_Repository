x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

x[1][0]=15
print(x)

students[0]["last_name"]="Bryant"
print(students)

sports_directory["soccer"][0]="Andres"
print(sports_directory)

z[0][1]=30
print(z)
students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
]         
def iterateDictionary(students):
    for i in students:
        print("first_name - "+i["first_name"]+", last_name - "+i["last_name"])

iterateDictionary(students)

# def iterateDicionary(students):
#     for i in students:
#         print("first_name -"+i["first_name"]+", last_name - "+i["last_name"])
# iterateDicionary(students)

dojo = {
    'locations':['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors':['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
print(dojo)