package assistedproblem.vehicleandtransportsystem;

//Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    //Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //method to display details
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
