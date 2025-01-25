package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "25-01-2025");
        order.displayOrderDetails();
        System.out.println();

        ShippedOrder shippedOrder = new ShippedOrder("ORD123", "25-01-2025", "TRK56789");
        shippedOrder.displayOrderDetails();
        System.out.println();

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "25-01-2025", "TRK12345", "27-01-2025");
        deliveredOrder.displayOrderDetails();
    }
}
