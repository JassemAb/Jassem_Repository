/* 
  Acronyms
  Create a function that, given a string, returns the string’s acronym 
  (first letter of each word capitalized). 
  Do it with .split first if you need to, then try to do it without
*/

const strA = "object oriented programming";
const expectedA = "OOP";

// The 4 pillars of OOP
const strB = "abstraction polymorphism inheritance encapsulation";
const expectedB = "APIE";

const strC = "software development life cycle";
const expectedC = "SDLC";

//- Bonus: ignore extra spaces
// const strD = "  global   information tracker    ";
// const expectedD = "GIT";
function acronomize(strA){
    // .split()->
    var arr = str.split(" ")
    var result = ""
    for (var i=0; i<arr.length; i++){
        result+=arr[i][0].toUpperCase()
    }
        console.log(result);
    return result
}

acronomize(strA)
acronomize(strB)
acronomize(strC)
