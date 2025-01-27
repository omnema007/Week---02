package problemstatetment.librarymanagementsystem;

//Book class
class Book extends LibraryItem implements Reservable{
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            available = false;
            System.out.println("Book reserved by: " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
