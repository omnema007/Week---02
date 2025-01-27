package problemstatetment.librarymanagementsystem;

//Magazine class
class Magazine extends LibraryItem implements Reservable{
    private boolean available = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            available = false;
            System.out.println("Magazine reserved by: " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
