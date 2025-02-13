package Collections;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put(3, "Lithium");
        map.put(6, "Carbon");
        map.put(1, "Hydrogen");
        map.put(5, "Boron");
        map.put(4, "Berrilium");
        map.put(2, "Helium");
        map.put(7, "Nitrogen");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of entries you want to add to the map: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.print("Enter key " + (i + 1) + " (can be any object): ");
            String keyInput = scanner.nextLine();
            Object key = keyInput;
            System.out.print("Enter value for key \"" + key + "\" (can be any object): ");
            String valueInput = scanner.nextLine();
            Object value = valueInput;
            map.put(key, value);
        }

        List<Object> sortedValues = getValues(map);
        System.out.println("Sorted Values: " + sortedValues);

        System.out.println("\nSorted entries (by key):");
        List<Map.Entry<Object, Object>> sortedEntries = getSortedEntriesByKey(map);
        for (Map.Entry<Object, Object> entry : sortedEntries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    private static List<Object> getValues(Map<Object, Object> map) {
        List<Object> values = new ArrayList<>(map.values());
        Collections.sort((List)values);
        return values;

    }

    public static List<Map.Entry<Object, Object>> getSortedEntriesByKey(Map<Object, Object> map) {
        List<Map.Entry<Object, Object>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Object, Object>>() {
            @Override
            public int compare(Map.Entry<Object, Object> entry1, Map.Entry<Object, Object> entry2) {
                // Compare based on the key (entry1.getKey() and entry2.getKey())
                return ((Comparable<Object>) entry1.getKey()).compareTo(entry2.getKey());
            }

        });
        return entryList;
    }
}
