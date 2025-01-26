package problemstatetment.ecommerceplatform;

//Electronic class
class Electronics extends Product implements Taxable{
    private static final double discountRate = 0.10;
    private static final double taxRate = 0.18;

    //Constructor
    public Electronics(int productId, String name, double price) {
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

    public String getTaxDetails() {
        return "Tax Rate: 18%";
    }
}
