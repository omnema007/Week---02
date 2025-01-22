class Book {
    private static String libraryName = "City Library";

    private final int isbn;

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Using instanceof to ensure object type is Book
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object!");
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();
        System.out.println();

        // Create book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 98972345);
        Book book2 = new Book("1984", "George Orwell", 78656633);

        // Display book details
        book1.displayBookDetails();
        System.out.println();

        book2.displayBookDetails();
    }
}
