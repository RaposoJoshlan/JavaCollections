package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        System.out.println(theatre.reserveSeat("A02") ? "Please pay" : "Seat was already reserved");

        System.out.println(theatre.reserveSeat("A02") ? "Please pay" : "Seat was already reserved");

        System.out.println(theatre.reserveSeat("B13") ? "Please pay" : "Seat was already reserved");

        List<Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(new Seat("B00", 13.00));
        priceSeat.add(new Seat("A00", 13.00));
        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        printList(priceSeat);

    }

    public static void printList(List<Seat> list) {
        for (Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }

        System.out.println();
        System.out.println("========================================================================================================================================================================================");


    }
}
