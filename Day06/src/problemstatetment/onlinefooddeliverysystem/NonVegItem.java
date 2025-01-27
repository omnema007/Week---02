package problemstatetment.onlinefooddeliverysystem;

//Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable{
    private double discountApplied = 0;
    private static final double NON_VEG_SURCHARGE = 2.0;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Calculate total price for Non-Veg items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
    }

    // Apply discount to Non-Veg items
    @Override
    public void applyDiscount(double percentage) {
        discountApplied = (percentage / 100) * calculateTotalPrice();
    }

    @Override
    public double getDiscountDetails() {
        return discountApplied;
    }
}
