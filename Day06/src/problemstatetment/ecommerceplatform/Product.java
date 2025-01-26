package problemstatetment.ecommerceplatform;

//Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    //Constructer
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //abstract method
    public abstract double calculateDiscount();

    //method to display details
    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
