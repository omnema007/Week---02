public class Vehicle {
    String ownerName;
    String vehicleType; 
    static double registrationFee = 500.0; 

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method 
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method 
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
       
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike");

        // Display vehicle details
        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Update the registration fee
        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(600.0);

        // Display vehicle details again after fee update
        System.out.println("\nVehicle 1 Details After Fee Update:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details After Fee Update:");
        vehicle2.displayVehicleDetails();
    }
}
