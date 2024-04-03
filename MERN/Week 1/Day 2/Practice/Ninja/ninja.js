class Ninja{
 constructor(name){
  this.name = name
  this.health = 90
  this.speed = 3
  this.strength = 3
 }
 sayName(){
  console.log( `The name of the Ninja is:${this.name}`)
 }
 showStats(){
  console.log( `The name of the Ninja is:${this.name}, Stats: strength:${this.strength}, health:${this.health}, speed:${this.speed}`,)
 }
 drinkShake(){
  this.health+=10;
 }
}


const ninja1 = new Ninja("Hyabusa");
ninja1.drinkShake();
ninja1.sayName();
ninja1.showStats();