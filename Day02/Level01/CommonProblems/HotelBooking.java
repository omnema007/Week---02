public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

 
    public static void main(String[] args) {
        
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        HotelBooking paraBooking = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        paraBooking.displayBookingDetails();

        // Create a booking using the copy constructor
        HotelBooking clonedBooking = new HotelBooking(paraBooking);
        System.out.println("\nCloned Booking:");
        clonedBooking.displayBookingDetails();
    }
}
