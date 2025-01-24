import java.util.ArrayList;

//Order class
class Order{

    String orderName;
    ArrayList<Product> products;

    //Constructor
    public Order(String orderName){
        this.orderName=orderName;
        this.products = new ArrayList<>();
    }

    public void showProducts() {
        for(Product p:products){
            System.out.println("For order "+this.orderName+" Product is "+p.productName);
        }
    }

    public void addProducts(Product... product){
        for (Product p:product){
            products.add(p);
        }
    }
}

//Customer class
class Customer1{

    public String customerName;
    public ArrayList<Order> orders;

    public Customer1(String customerName){
        this.customerName=customerName;
        this.orders = new ArrayList<>();
    }

    public void showOrders() {
        for(Order o:orders){
            System.out.println("For customer " + this.customerName+" Order is "+o.orderName);
        }
    }

    public void placeOrder(Order order){
        orders.add(order);
    }

}

//Product class
class Product{

    String productName;

    public Product(String productName){
        this.productName=productName;
    }

}

public class ECommercePlatform {
    public static void main(String[] args) {

        Customer1 customer1 = new Customer1("Mohan");
        Customer1 customer2 = new Customer1("Deepak");

        Product product1 = new Product("Smart Phone");
        Product product2 = new Product("Laptop");
        Product product3 = new Product("Keyboard");
        Product product4 = new Product("Pen Drive");
        Product product5 = new Product("HDD");

        Order order1 = new Order("List1");
        Order order2 = new Order("List2");

        order1.addProducts(product1,product2);
        order2.addProducts(product3,product4,product5);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        customer1.showOrders();
        order1.showProducts();

        customer2.showOrders();
        order2.showProducts();
    }
}
