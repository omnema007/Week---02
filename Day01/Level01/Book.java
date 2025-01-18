class Book {

String title;
String author;
double price;

public Book(String title, String author, double price) {
this.title = title;
this.author = author;
this.price = price;
}

//Method to display the bookk details
public void displayBookDetails() {
System.out.println("Book Details: ");
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Price: " + price);

}

public static void main(String[] args) {
Book book1 = new Book("Java", "Herbert Schildt", 399.65);

//Display the result
book1.displayBookDetails();
}
}