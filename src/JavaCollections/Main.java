package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).isReserved();

        System.out.println(theatre.reserveSeat("A02") ? "Please pay" : "Seat was already reserved");

        Collections.shuffle(seatCopy);
        System.out.println("Print seat Copy ");
        printList(seatCopy);

        System.out.println("Print theatre seat");
        printList(theatre.seats);

        Seat minSeat = Collections.min(seatCopy);
        System.out.println("Min Seat Number " + minSeat.getSeatNumber());
        Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Max Seat Number " + maxSeat.getSeatNumber());

    }

    public static void printList(List<Seat> list) {
        for (Seat seat: list) {
            System.out.println(" " + seat.getSeatNumber());
        }

        System.out.println();
        System.out.println("========================================================================================================================================================================================");


    }
}
