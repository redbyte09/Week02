package MovieTicket;

public class MovieTicket {
    
        // Attributes
        private String movieName;
        private int seatNumber;
        private double price;
        private boolean isBooked;
    
        // Constructor to initialize the MovieTicket
        public MovieTicket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = false; // Initially, the ticket is not booked
        }
    
        // Method to book a ticket
        public void bookTicket() {
            if (!isBooked) {
                isBooked = true;
                System.out.println("Ticket booked successfully for movie: " + movieName);
            } else {
                System.out.println("Ticket already booked for seat number: " + seatNumber);
            }
        }
    
        // Method to display ticket details
        public void displayTicketDetails() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
        }
    
        // Main method to test the functionality
        public static void main(String[] args) {
            // Create a new movie ticket
            MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", 101, 12.5);
    
            // Display the ticket details before booking
            ticket1.displayTicketDetails();
    
            // Book the ticket
            ticket1.bookTicket();
    
            // Display the ticket details after booking
            ticket1.displayTicketDetails();
    
            // Try booking the ticket again
            ticket1.bookTicket();
        }
    }
    

