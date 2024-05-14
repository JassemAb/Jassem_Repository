public class CafeJava {
 public static void main(String[] args) {
     // APP VARIABLES
     // Lines of text that will appear in the app. 
     String generalGreeting = "Welcome to Cafe Java, ";
     String pendingMessage = " your order will be ready shortly";
     String readyMessage = " your order is ready";
     String displayTotalMessage = "Your total is $";
     
     // Menu variables (add yours below)
     double mochaPrice = 3.5;
     double dripCoffee = 4.5;
     double latte = 5.5;
     double cappuccino = 7.5;
 
     // Customer name variables (add yours below)
     String customer1 = "Cindhuri";
     String customer2 = "Sam";
     String customer3 = "Jimmy";
     String customer4 = "Noah";
     
 
     // Order completions (add yours below)
     boolean isReadyOrder1 = false;
     boolean isReadyOrder2 = false;
     boolean isReadyOrder3 = true;
     boolean isReadyOrder4 = true;
 
     // APP INTERACTION SIMULATION (Add your code for the challenges below)
     // Example:
     System.out.println( customer1 + ":" + readyMessage + mochaPrice); // Displays "Welcome to Cafe Java, Cindhuri"
  // ** Your customer interaction print statements will go here ** //
  if(isReadyOrder3){
    System.out.println(customer3+ ":" + readyMessage + displayTotalMessage   + ":" + latte);
  }else{
    System.out.println(pendingMessage);
  }
  System.out.println(customer2+":"+ readyMessage+ latte*2);
 }
}
