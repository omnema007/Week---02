package problemstatetment.librarymanagementsystem;

//DVD class
class DVD extends LibraryItem implements Reservable{
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            available = false;
            System.out.println("DVD reserved by: " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
