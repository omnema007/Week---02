public class MovieTicket {
String movieName;
int seatNumber;
double price;

public MovieTicket(String movieName, int seatNumber, double price) {
this.movieName = movieName;
this.seatNumber = seatNumber;
this.price = price;
}

// Method to book a ticket
public void bookTicket(String m, int s, double p) {
movieName = m;
seatNumber = s;
price = p;
System.out.println("Ticket booked successfully!");
}

// Method to display ticket details
public void displayTicketDetails() {
System.out.println("Movie Name: " + movieName);
System.out.println("Seat Number: " + seatNumber);
System.out.println("Price:" + price);
}

    
public static void main(String[] args) {
        
MovieTicket ticket = new MovieTicket("Not Booked", 0, 0.0);

ticket.bookTicket("Spider Man", 45, 12.5);

ticket.displayTicketDetails();
}
}
