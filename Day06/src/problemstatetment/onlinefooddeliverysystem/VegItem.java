package problemstatetment.onlinefooddeliverysystem;

//Subclass VegItem
class VegItem extends FoodItem implements Discountable{
    private double discountApplied = 0;

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double percentage) {
        discountApplied = (percentage / 100) * calculateTotalPrice();
    }

    @Override
    public double getDiscountDetails() {
        return discountApplied;
    }
}
