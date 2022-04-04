package JavaCollections;

public class Seat implements Comparable<Seat>{
    private double price;
    private final String seatNumber;
    private boolean reserved = false;

    public Seat(String seatNumber, double price) {
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        if(!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " is reserved");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel () {
        if(this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
}
