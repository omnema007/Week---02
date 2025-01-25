package multilevelinheritance.onlineretailordermanagement;

// Subclass ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

