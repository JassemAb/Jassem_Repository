class Ninja{
 constructor(name,health,speed,strength){
  this.name = name
  this.health = health
  this.speed = speed
  this.strength = strength
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

class sensei extends Ninja{
 constructor(name){
  super(name,200,10,10)
  this.wisdom = 10
 }
 speakWisdom(){
  super.drinkShake();
  console.log("What one programmer can do in one month, two programmers can do in two months.")
 }
 showStats(){
  super.showStats()
 }
}




const superNinja=new sensei('Master Splinter')


superNinja.speakWisdom()
superNinja.showStats()