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

        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            loc = scanner.nextInt();

            if(!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
