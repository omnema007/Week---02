package problemstatetment.librarymanagementsystem;

//Interface Reservable
public interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
