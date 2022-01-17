import multimap.HashMultimap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> correctValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> correctKeys = List.of("123", "456", "789");
        HashMultimap<String, Integer> testMap;

        testMap = new HashMultimap<>(10);

        for (int v = 0; v < correctValues.size(); v++) {
            testMap.put(correctKeys.get(v / 3), correctValues.get(v));
        }
        for (Map.Entry<String, Integer> entry : testMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
