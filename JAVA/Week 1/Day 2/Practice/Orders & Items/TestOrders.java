import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        Item item1 = new Item("Expresse", 10.9);
        Item item2 = new Item("Milk", 3);
        Item item3 = new Item("Cappuccino", 9.9);
        ArrayList<Item> itemlist1 = new ArrayList<>();
        itemlist1.add(item1);
        Order order1 = new Order("Cindhuri" , 23.3 , false , itemlist1);
        Order order2 = new Order("Jimmy", 10.3, false, new ArrayList<>());
        Order order4 = new Order("Sam", 5.3, false, new ArrayList<>());
        System.out.println(order1);
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.getReady());

        order1.addItem(item1);
        System.out.printf("Order 2 Total After adding : %s\n" , order1.getTotal());
        order2.addItem(item2);
        System.out.printf("Order 4 Total After Adding : %s \n" , order2.getTotal());
        order1.setReady(true);
        order2.addItem(item3);
        order4.addItem(item3);
        System.out.printf("the new Order for Sam is :\n ");
        order2.setReady(true);
    }
}