package AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created on 04/04/2022
 */

class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "Computer learning Java", tempExit));

        //Location_1
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "Computer learning JavaScript", tempExit));

        //Location_2
        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "Computer " + "learning ReactJS", tempExit));

        //Location_3
        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "Computer learning Go", tempExit));

        //Location_4
        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "Computer " + "learning C++", tempExit));

        //Location_5
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "Computer learning C", tempExit));


        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
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
