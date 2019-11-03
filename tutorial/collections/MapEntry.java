package tutorial.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEntry {
    public static void main(String[] args) {
        Map<String, Integer> daysOfMonths = new HashMap<>();
        daysOfMonths.put("Janurary", 31);
        daysOfMonths.put("February", 28);
        daysOfMonths.put("March", 31);
        daysOfMonths.put("April", 30);
        for (Map.Entry<String, Integer> entry : daysOfMonths.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " days");
        }

    }
}
