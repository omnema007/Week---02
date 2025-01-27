package problemstatetment.onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Tikka", 8.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Wings", 10.0, 3);

        // Process orders
        processOrder(vegItem, 10.0);
        processOrder(nonVegItem, 5.0); 
    }

    // Process order
    public static void processOrder(FoodItem item, double discountPercentage) {
        item.getItemDetails();
        System.out.println("Total Price Before Discount: $" + item.calculateTotalPrice());

        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            discountable.applyDiscount(discountPercentage);
            System.out.println("Applied Discount: " + discountable.getDiscountDetails());
        }

        System.out.println("Final Price After Discount: $" + (item.calculateTotalPrice() - ((Discountable) item).getDiscountDetails()));
        System.out.println();
    }
}
