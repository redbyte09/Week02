package HotelBooking;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Setter for guestName
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter for guestName
    public String getGuestName() {
        return guestName;
    }

    // Setter for roomType
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter for roomType
    public String getRoomType() {
        return roomType;
    }

    // Setter for nights
    public void setNights(int nights) {
        this.nights = nights;
    }

    // Getter for nights
    public int getNights() {
        return nights;
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking obj1 = new HotelBooking();
        System.out.println("Default Booking: " + obj1.getGuestName() + ", " + obj1.getRoomType() + ", " + obj1.getNights() + " nights");

        // Using parameterized constructor
        HotelBooking obj2 = new HotelBooking("Pranjal", "Luxurious", 2);
        System.out.println("Parameterized Booking: " + obj2.getGuestName() + ", " + obj2.getRoomType() + ", " + obj2.getNights() + " nights");

        // Using copy constructor
        HotelBooking obj3 = new HotelBooking(obj2);
        System.out.println("Copy Booking: " + obj3.getGuestName() + ", " + obj3.getRoomType() + ", " + obj3.getNights() + " nights");
    }
}
