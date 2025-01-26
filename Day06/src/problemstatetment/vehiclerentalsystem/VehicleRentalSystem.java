package problemstatetment.vehiclerentalsystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("MP123", "Car", 50, "CARIN001");
        Vehicle bike = new Bike("MP456", "Bike", 20, "BIKEIN002");
        Vehicle truck = new Truck("MP789", "Truck", 100, "TRKIN003");

        Vehicle[] vehicles = {car, bike, truck};

        for(Vehicle vehicle : vehicles){
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println();
        }
    }
}
