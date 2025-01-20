public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rentalRate;

    // Default constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        rentalRate = 50.0; 
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
        
    }

    
    // Calculate total cost
    public double calculateTotalCost() {
        return rentalRate * rentalDays;
    }

    // Display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate per day: $" + rentalRate);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        CarRental customRental = new CarRental("John Doe", "SUV", 5, 100.0);
        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();
    }
}
