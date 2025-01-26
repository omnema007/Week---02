package problemstatetment.vehiclerentalsystem;

//Car class
class Car extends Vehicle implements Insurable{
    private String insuranceNumber;

    //Constructor
    public Car(String vehicleNumber, String type, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insuranceNumber;
    }
}
