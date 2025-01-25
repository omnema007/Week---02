package assistedproblem.vehicleandtransportsystem;

public class VehicleAndTransportSystem {
    public static void main (String []args){

        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", "Sports");

        Vehicle[] vehicles = { car, truck, motorcycle };

        System.out.println("Vehicle Information:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }

}

}
