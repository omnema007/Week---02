package problemstatetment.ridehailingapplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Ravi", 2.5);
        Vehicle bike = new Bike("B001", "Mohit", 1.5);
        Vehicle auto = new Auto("A001", "Deepak", 2.0);

        updateAndDisplayLocation((GPS) car, "Downtown");
        updateAndDisplayLocation((GPS) bike, "City Center");
        updateAndDisplayLocation((GPS) auto, "Station");

        processFare(car, 10.0);
        processFare(bike, 5.0);
        processFare(auto, 8.0);
    }

    public static void processFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Total Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
        System.out.println();
    }

    public static void updateAndDisplayLocation(GPS gps, String newLocation) {
        gps.updateLocation(newLocation);
        System.out.println("Updated Location: " + gps.getCurrentLocation());
        System.out.println();
    }
}
