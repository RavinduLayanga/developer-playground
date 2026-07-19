import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {
        Map<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        // This prints in ALPHABETICAL order, not insertion order!
        System.out.println("Sorted Capitals: " + capitalCities);

        System.out.println("Get England (fixed typo): " + capitalCities.get("England"));
        System.out.println("Removed Norway. Its capital was: " + capitalCities.remove("Norway"));
        System.out.println("Map Size: " + capitalCities.size());
        System.out.println("Has India? " + capitalCities.containsKey("India"));
        System.out.println("Has Oslo? " + capitalCities.containsValue("Oslo"));

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("Key" + i + "value " + capitalCities.get(i));
        }

        System.out.println("\nLooping through Capitals:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        capitalCities.clear();
        System.out.println("Is map empty after clear? " + capitalCities.isEmpty());

        System.out.println("\n--- 2. Finding Closest Matches ---");
        // Scenario: A theme park's height requirements for rides.
        // Key: Minimum Height in cm | Value: Ride Name
        TreeMap<Integer, String> rides = new TreeMap<>();

        rides.put(120, "Rollercoaster");
        rides.put(90, "Teacups");
        rides.put(140, "Drop Tower");
        rides.put(100, "Ferris Wheel");

        // 1. The Map automatically sorts itself by Key (90, 100, 120, 140)
        System.out.println("All rides sorted by height: " + rides);
        // Output: {90=Teacups, 100=Ferris Wheel, 120=Rollercoaster, 140=Drop Tower}

        // 2. Finding Extremes
        System.out.println("Shortest requirement: " + rides.firstKey() + "cm"); // 90
        System.out.println("Tallest requirement: " + rides.lastKey() + "cm"); // 140

        // 3. Finding Closest Matches for a child who is exactly 115cm tall
        int childHeight = 115;

        // "What is the tallest ride this child is allowed to go on?" (Floor = less than
        // or equal to)
        Integer highestAllowed = rides.floorKey(childHeight);
        System.out.println("At 115cm, you can ride the " + rides.get(highestAllowed));
        // Output: Ferris Wheel (100cm)

        // "How much taller does the child need to be for the next ride?" (Higher =
        // strictly greater)
        Integer nextRide = rides.higherKey(childHeight);
        System.out.println("The next ride requires " + nextRide + "cm");
        // Output: 120

        // lowerKey: Strictly less than 115 (100)
        System.out.println("Strictly smaller requirement (lower): " + rides.lowerKey(childHeight) + "cm");

        // ceilingKey : Greater than OR equal to 115 (120)
        System.out.println("Next ride they can grow into (ceiling): " + rides.ceilingKey(childHeight) + "cm");

        System.out.println("\n--- 3. Polling (Removing Extremes) ---");
        TreeMap<Integer, String> waitingList = new TreeMap<>();

        waitingList.put(3, "Charlie");
        waitingList.put(1, "Alice");
        waitingList.put(2, "Bob");

        System.out.println("List before poll: " + waitingList);
        // Output: {1=Alice, 2=Bob, 3=Charlie}

        // pollFirstEntry() grabs the lowest key (1) and removes it
        Map.Entry<Integer, String> nextPatient = waitingList.pollFirstEntry();

        System.out.println("Just removed patient: " + nextPatient.getValue());
        // Output: just removed patient: Alice

        // pollLastEntry() to grab the highest key
        Map.Entry<Integer, String> lastPatient = waitingList.pollLastEntry();
        System.out.println("Doctor called last patient: " + lastPatient.getValue());

        System.out.println("List after polls: " + waitingList); // Only Bob is left!

        System.out.println("\n--- 4. NEW: Views and Range Queries ---");
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(50, "F");
        scores.put(70, "C");
        scores.put(80, "B");
        scores.put(90, "A");
        scores.put(100, "A+");

        // descendingMap: Instantly flip the map backwards (Highest to Lowest)
        System.out.println("Reversed Scores: " + scores.descendingMap());

        // headMap: Get a sub-map of everything strictly LESS than the key (e.g., all
        // scores under 80)
        System.out.println("Scores strictly under 80 (headMap): " + scores.headMap(80));

        // tailMap: Get a sub-map of everything GREATER than or EQUAL to the key (e.g.80
        // and above).
        System.out.println("Scores 80 and above (tailMap): " + scores.tailMap(80));

        // subMap: Get a slice between two boundaries (Inclusive Start, Exclusive End)
        System.out.println("Scores from 70 up to 90 (subMap): " + scores.subMap(70, 90));

    }

}
