package hybridinheritance.vehiclemanagementsystem;

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }
}

