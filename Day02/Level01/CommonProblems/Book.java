public class Book {
    // Attributes
    public String title;
    public String author;
    public double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

  
    public static void main(String[] args) {
      
        Book defaultBook = new Book();
        System.out.println("Default Constructor:");
        defaultBook.displayDetails();

        
        Book paramBook = new Book("Java Programming", "James Gosling", 39.99);
        System.out.println("\nParameterized Constructor:");
        paramBook.displayDetails();
    }
}
