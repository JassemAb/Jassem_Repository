import java.util.ArrayList;
import java.util.Scanner;

public class TestCafe {
    public static int getStreakGoal(){
        int sum=0;
        for(int i = 0;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
    public static double getOrderTotal(double[] price){
        double total = 0;
        for(int i=0;i<price.length;i++){
            total+=price[i];
        }
        return total;
    }
    public static void displayMenu(ArrayList<String> menuitems){
        for(int i =0;i<menuitems.size();i++){
            System.out.println(i + " " + menuitems.get(i));
        }
    }

    public static void addCustomer (ArrayList<String> customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        String username = scanner.nextLine();
        System.out.println("Hello , " + username);
        int customerahead = customer.size();
        System.out.printf("There is %d people ahead of you",customerahead);
        customer.add(username);
        scanner.close();
    }
}