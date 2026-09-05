package week_3.assignment;

public class Order {
    static int orderCount = 0;

    Order() {
        orderCount++;
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        System.out.println("Total Orders: " + orderCount);
    }
}