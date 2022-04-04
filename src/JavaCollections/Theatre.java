package JavaCollections;

import java.util.*;

public class Theatre {

    public final String theatreName;

    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);

        for(char row = 'A'; row<= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0 ) {
            return seats.get(foundSeat).isReserved();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public void getSeats() {
        for (Seat seat:seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
