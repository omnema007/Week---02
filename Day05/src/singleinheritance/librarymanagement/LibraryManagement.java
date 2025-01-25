package singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Java The Complete Reference", 2005, "Herbert Schildt", "Herbert Schildt is an American computing author, programmer and musician.");

        author.displayInfo();
    }
}
