import java.util.ArrayList;

public class CafeUtil {
    public static void main(String[] args){
        int getstreak = TestCafe.getStreakGoal();
        //System.out.println(getstreak);
        ArrayList<String> stringList = new ArrayList<>();
        double[] array = new double[3];
        for( int i =0;i<array.length;i++){
            array[i] = (double)(Math.random()*10);
        }
        double getTotal = TestCafe.getOrderTotal(array);
        stringList.add("drip coffee");
        stringList.add("cappuccino");
        stringList.add("latte");
        stringList.add("milk");
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", TestCafe.getStreakGoal());
        System.out.println("----- Order Total Test-----");
        System.out.printf("Order total: %s \n\n",TestCafe.getOrderTotal(array));
        System.out.println("----- Display Menu Test-----");
        TestCafe.displayMenu(stringList);
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        for(int i = 0;i< 4 ; i++){
            TestCafe.addCustomer(customers);
            System.out.println("\n");
        }
    }
}