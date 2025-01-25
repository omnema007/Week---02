package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model ", 200, 75);
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();

        PetrolVehicle petrolVehicle = new PetrolVehicle("Hyundai Venue", 180, 50);
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
