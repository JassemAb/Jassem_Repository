import java.util.ArrayList;

public class Order {
 // MEMBER VARIABLES
 private String name; // default value of null
 private boolean ready; // default value false
 private ArrayList<Item> items; // defaults to null
 //CONSTRUCTOR
 public Order(){
  this.name = "Jassem";
  this.items = new ArrayList<Item>();
 }

 public Order(String name){
  this.name = name;
  this.items = new ArrayList<Item>();
 }

 //Order Method
 public void addItem(Item item){
  items.add(item);
 }
 
 public String getStatusMessage(){
  if(this.ready){
   return "Your Order Is Ready";
  }
  return "Thank You For Waiting, Your Order Will Be Ready.";
 }

 public double getOrderTotal(){
  double total = 0;
  for(Item item : items){
   total += item.getPrice();
  }
  return total;
 }

 public void display(){
  System.out.println("Customer Name:" + this.name);
  for(Item item : items ){
   System.out.println(item.get() + "- $" + item.getPrice());
  }
 }
 public String getName(){
  return this.name;
}

public void setName(String name){
  this.name = name;
}

public boolean getReady(){
  return this.ready;
}

public void setReady(boolean ready){
  this.ready = ready;
}

public ArrayList<Item> getItems(){
  return this.items;
}

public void setItems(ArrayList<Item> items){
  this.items = items;
}
}