package problemstatetment.vehiclerentalsystem;

//Bike class
class Bike extends Vehicle implements Insurable{
    private String insuranceNumber;

    //Constructor
    public Bike(String vehicleNumber, String type, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insuranceNumber;
    }
}
