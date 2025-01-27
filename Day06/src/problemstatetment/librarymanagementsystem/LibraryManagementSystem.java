package problemstatetment.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Harry Potter", "J.K. Rowling");
        LibraryItem magazine = new Magazine("M001", "Forbes", "Forbes Editorial");
        LibraryItem dvd = new DVD("D001", "Avengers: Endgame", "Marvel Studios");

        processItem(book, "Alice");
        processItem(magazine, "Bob");
        processItem(dvd, "Charlie");
    }

    public static void processItem(LibraryItem item, String borrowerName) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            Reservable reservable = (Reservable) item;
            System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            reservable.reserveItem(borrowerName);
        }

        System.out.println();
    }
}
