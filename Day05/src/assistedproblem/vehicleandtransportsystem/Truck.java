package assistedproblem.vehicleandtransportsystem;

//Class Truck
class Truck extends Vehicle {
    int maxLoadCapacity;

    //Constructor
    public Truck(int maxSpeed, String fuelType, int maxLoadCapacity) {
        super(maxSpeed, fuelType);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    //method to display details
    public void displayInfo() {
        System.out.println("Truck Max Speed: " + maxSpeed);
        System.out.println("Truck Fuel Type: " + fuelType);
        System.out.println("Truck Max Load Capacity: " + maxLoadCapacity);
    }

}
