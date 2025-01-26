package problemstatetment.vehiclerentalsystem;

//Truck class
class Truck extends Vehicle implements Insurable{
    private String insuranceNumber;

    //Constructor
    public Truck (String vehicleNumber, String type, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy NUmber: " + insuranceNumber;
    }
}
