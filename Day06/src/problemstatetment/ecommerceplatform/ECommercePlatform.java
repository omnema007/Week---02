package problemstatetment.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Electronics laptop = new Electronics(101, "Laptop", 1200);
        Clothing tshirt = new Clothing(102, "T-Shirt", 50);
        Groceries apple = new Groceries(103, "Apple", 5);

        List<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(tshirt);
        products.add(apple);

        calculateFinalPrice(products);
    }
}
