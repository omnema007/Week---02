package problemstatetment.ecommerceplatform;

//Clothing class
class Clothing extends Product implements Taxable{
    private static final double discountRate = 0.20;
    private static final double taxRate = 0.12;

    //Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate 12%";
    }
}
