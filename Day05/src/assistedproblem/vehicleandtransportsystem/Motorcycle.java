package assistedproblem.vehicleandtransportsystem;

//Class Motorcycle
class Motorcycle extends Vehicle {
    String bikeType;

    //Constructor
    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    //method to display details
    public void displayInfo() {
        System.out.println("Bike Max Speed: " + maxSpeed);
        System.out.println("Bike Fuel Type: " + fuelType);
        System.out.println("Bike Type: " + bikeType);
    }

}

