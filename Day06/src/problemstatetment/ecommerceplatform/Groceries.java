package problemstatetment.ecommerceplatform;

//Groceries class
class Groceries extends Product{
    private static final double discountRate = 0.05;

    //Constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}
