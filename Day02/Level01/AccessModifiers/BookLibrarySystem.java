
class Book {
    public String ISBN; 
    protected String title; 
    private String author; 

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class EBook extends Book {
    private double fileSize; 


    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); 
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); 
        System.out.println("Title: " + title); 
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Author: " + getAuthor()); 
    }
}


public class BookLibrarySystem {
    public static void main(String[] args) {
  
        Book book = new Book("978-3-16-148410-0", "Java Programming", "Alice");
        System.out.println("Book Details:");
        book.displayBookDetails();

        // Modify the author's name using the setter
        book.setAuthor("Bob");
        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();

        // Create an EBook object
        EBook eBook = new EBook("978-1-23-456789-0", "Python Essentials", "Charlie", 1.5);
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
