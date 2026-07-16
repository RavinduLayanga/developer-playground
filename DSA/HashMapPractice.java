import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");

        // This duplicate key simply overwrites the previous "Norway" value with "Oslo"
        // again.
        // The Map size stays the same.
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("--- HashMap Operations ---");

        // 1. .get() method
        System.out.println("Searching for 'England' (correct case): " + capitalCities.get("England")); // Return London

        // 2. .remove() and .size() methods
        // .remove() returns the value of the item it just deleted.
        System.out.println("Removing India. Its capital was: " + capitalCities.remove("India"));
        System.out.println("Total cities remaining: " + capitalCities.size());

        System.out.println("\n--- Looping over Keys ---");
        for (String i : capitalCities.keySet()) {
            System.out.println("Country: " + i);
        }

        System.out.println("\n--- Student Marks Map ---");
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Amara", 45);
        studentMarks.put("Kamal", 65);
        studentMarks.put("Sitha", 55);
        studentMarks.put("Dumindu", 95);
        studentMarks.put("Pawani", 75);

        System.out.println("Looping over Values only:");
        for (int i : studentMarks.values()) {
            System.out.println("Score: " + i);
        }

        // 3. Loop through a Map with entrySet()
        System.out.println("\nLooping over BOTH Keys and Values using entrySet():");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " | Mark: " + entry.getValue());
        }

        System.out.println("\nRaw Map output before clear: " + studentMarks);
        studentMarks.clear();
        System.out.println("Raw Map output after clear: " + studentMarks);

        var people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        System.out.println(people);

    }
}