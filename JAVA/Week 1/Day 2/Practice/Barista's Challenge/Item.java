public class Item{
 //MEMBER VARIABLES
 private String name;
 private double price;
 //CONSTRUCTOR
 public Item(String name, double price){
  this.name = name;
  this.price = price;
 }
 // GETTER
 public String getName(){
  return this.name;
 }
 //SETTER
 public void setName(String name) {
  this.name = name;
 }
 //GETTER
 public double getPrice(){
  return this.price;
 }
 //SETTER
 public void setPrice(double price) {
  this.price = price;
 }
 public String get() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'get'");
 }
}