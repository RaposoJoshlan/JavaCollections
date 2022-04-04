package AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created on 04/04/2022
 */

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Computer learning Java"));
        locations.put(1, new Location(1, "Computer learning JavaScript"));
        locations.put(2, new Location(2, "Computer " + "learning ReactJS"));
        locations.put(3, new Location(3, "Computer learning Go"));
        locations.put(4, new Location(4, "Computer " + "learning C++"));
        locations.put(5, new Location(5, "Computer learning C"));
        locations.put(6, new Location(6, "Computer " + "learning Python"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);

        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            System.out.println(exits.containsKey(direction) ? loc = exits.get(direction) : "You cannot go in that " +
                    "direction");
        }
    }
}
