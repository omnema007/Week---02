public class Book2 {
    String title;
    String author;
    double price;
    boolean availability;

    // Default constructor
    public Book2() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
        availability = true; 
    }

    // Parameterized constructor
    public Book2(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        
        Book2 defaultBook = new Book2();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        // Create a book using the parameterized constructor
        Book2 customBook = new Book2("Java Programming", "John Doe", 39.99, true);
        System.out.println("\nCustom Book:");
        customBook.displayDetails();

        customBook.borrowBook();

        customBook.borrowBook();
    }
}
