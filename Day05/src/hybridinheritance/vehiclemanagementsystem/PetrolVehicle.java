package hybridinheritance.vehiclemanagementsystem;

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println(model + " is refueling with a tank capacity of " + fuelTankCapacity + " liters.");
    }
}
