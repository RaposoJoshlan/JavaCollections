package MapInterface;

import java.util.*;

/**
 * Created on 04/04/2022
 */

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled high-level OOP, platform independent language");

        languages.put("Python", "An interpreted, OOP, high-level programming language with dynamic semantics");

        languages.put("Algol", "An algorithm language");

        languages.put("JavaScript", "A Web dev language");

        languages.put("ReactJS", "A Web dev front-end language");

        if (languages.containsKey("Java")) {
            System.out.println("Key already added");
        } else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println("====================================");

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
