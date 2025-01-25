package hybridinheritance.restaurantmanagement;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101, "Chinese Food");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        Waiter waiter = new Waiter("Bob", 202, 5);
        waiter.displayDetails();
        waiter.performDuties();
    }
}
