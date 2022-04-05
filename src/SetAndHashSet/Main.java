package SetAndHashSet;

import java.util.*;

/**
 * Created on 05/04/2022
 */

public class Main {

    /**
     * Sets have no order defined and a set cannot contain duplicates
     * HashSet a subtype of Set interface
     * There is no way to retrieve an item from a set. It only permits if the item exists
     * */

    private static final Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon of Mercury", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Moon of Venus", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Moon of Earth", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets");
        for (HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mercury");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody earthMoons : body.getSatellites()) {
            System.out.println("\t" + earthMoons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for (HeavenlyBody moon: moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody venus = new HeavenlyBody("Venus", 842);
        planets.add(venus);

        for (HeavenlyBody planet: planets) {
            System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");
    }
}
