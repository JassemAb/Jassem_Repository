console.log(hello)
var hello = 'world'
//=====> the output will be undefined


var needle = 'haystack';
test();
function test(){
 var needle = 'magnet';
 console.log(needle);
}
// =====> the output will be magnet



var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
// ====>the output will be super cool


var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}

// ====> the output will be chicken, half chicken

mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
// ====> ERROR

console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);

// ===>undefined


dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";// ====>the output is seattle
    console.log(dojo);  
    var dojo = "burbank";// ====>the output is burbank
    console.log(dojo);
}
console.log(dojo);


console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}





