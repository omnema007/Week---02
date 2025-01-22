class Vehicle {
    private final int registrationNumber;
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;
    private static int vehicleCount = 0;

    // Constructor
    public Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;

        vehicleCount++;
    }
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid object. Not an instance of Vehicle.");
        }
    }
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to $" + registrationFee);
        } else {
            System.out.println("Invalid fee. Fee must be greater than zero.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(123456, "Alice", "Car");
        Vehicle vehicle2 = new Vehicle(78934,"Bob", "Bike");

        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(600.0);

        System.out.println("\nVehicle 1 Details After Fee Update:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details After Fee Update:");
        vehicle2.displayVehicleDetails();

    }
}
