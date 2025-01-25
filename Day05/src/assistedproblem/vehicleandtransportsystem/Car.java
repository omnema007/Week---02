package assistedproblem.vehicleandtransportsystem;

//Class car
class Car extends Vehicle{
    int seatCapacity;

    //Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //method to display details
    public void displayInfo() {
        System.out.println("Car Max Speed: " + maxSpeed);
        System.out.println("Car Fuel Type: " + fuelType);
        System.out.println("Car Seat Capacity: " + seatCapacity);
    }
}
