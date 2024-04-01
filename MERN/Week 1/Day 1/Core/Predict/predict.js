const cars = ['Tesla', 'Mercedes', 'Honda']
const [ randomCar ] = cars
const [ ,otherRandomCar ] = cars
//Predict the output
// the output is Tesla and Mercedes
console.log(randomCar)
console.log(otherRandomCar)


const employee = {
 name: 'Elon',
 age: 47,
 company: 'Tesla'
}
const { name: otherName } = employee;
//Predict the output
console.log(name);
console.log(otherName);
// ====> the output is not defined



const person = {
 name: 'Phil Smith',
 age: 47,
 height: '6 feet'
}
const password = '12345';
const { password: hashedPassword } = person;  
//Predict the output
console.log(password);//The output is ====>12345
console.log(hashedPassword);//undefined


const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [,first] = numbers;
const [,,,second] = numbers;
const [,,,,,,,,third] = numbers;
//Predict the output
console.log(first == second);// false
console.log(first == third);//true


const lastTest = {
 key: 'value',
 secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [ ,willThisWork] = secondKey;
//Predict the output
console.log(key);
console.log(secondKey);//====>[1, 5, 1, 8, 3, 3]
console.log(secondKey[0]);//====>1
console.log(willThisWork);//====>5