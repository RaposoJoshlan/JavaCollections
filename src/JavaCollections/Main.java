package JavaCollections;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        //theatre.getSeats();

        System.out.println(theatre.reserveSeat("H18") ? "Please Pay" : "Sorry seat is already taken");

        System.out.println(theatre.reserveSeat("H11") ? "Please Pay" : "Sorry, seat is already taken");






    }
}
