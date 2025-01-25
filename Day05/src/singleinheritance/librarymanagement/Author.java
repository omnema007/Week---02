package singleinheritance.librarymanagement;

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

