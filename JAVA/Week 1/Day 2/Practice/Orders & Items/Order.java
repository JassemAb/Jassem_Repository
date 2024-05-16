import java.util.ArrayList;
import java.util.Arrays;



public class Order{

 private String name;
 private double total;
 private boolean ready;
 private ArrayList<Item> items;

 public Order(String name, double total, boolean ready, ArrayList<Item> items){
  this.name = name;
  this.total = total;
  this.ready = ready;
  this.items = items;
 }

 public String getName(){
  return this.name;
 }

 public double getTotal(){
  return this.total;
 }
 
 public void setName (String name){
  this.name = name;
 }

 public boolean getReady(){
  return this.ready;
 }

 public ArrayList<Item> getItems(){
  return this.items;
 }


 public void addItem(Item item) {
  this.items.add(item);
  this.total += item.getPrice();
 }

 public String setReady(boolean ready) {
  this.ready = ready;
 {
   return this.name + ",Your order is ready. The total is" + this.total;
 }
 }
}