class Product {
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Static variables
    private static int totalProducts = 0;
    private static double discount = 0.0;

    // Constructor
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

        totalProducts++;
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount Applied: " + discount + "%");
        } else {
            System.out.println("Invalid object. Not an instance of Product.");
        }
    }

    // Static method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid discount value.");
        }
    }
}

public class Product1 {
    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product product1 = new Product(1, "Laptop", 1200.50, 2);
        Product product2 = new Product(2, "Smartphone", 800.00, 5);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        // Display total products
        System.out.println("\nDisplaying Total Products:");
        Product.displayTotalProducts();

        // Update the discount and display updated details
        System.out.println("\nUpdating Discount:");
        Product.updateDiscount(15.0);

        System.out.println("\nUpdated Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nUpdated Product 2 Details:");
        product2.displayProductDetails();
    }
}
