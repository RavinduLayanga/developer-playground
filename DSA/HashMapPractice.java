import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        System.out.println("Does map have key 'Sitha'? " + studentMarks.containsKey("Sitha")); // true
        System.out.println("Does map have score 95? " + studentMarks.containsValue(95)); // true

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

        System.out.println("Is the map empty now? " + studentMarks.isEmpty()); // true
        System.out.println("Raw Map output after clear: " + studentMarks);

        var people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        System.out.println(people);

        // putIfAbsent: John is already 32, so this does NOTHING.
        people.putIfAbsent("John", 34);
        // putIfAbsent: Kamal is NOT in the map, so it ADDS him.
        people.putIfAbsent("Kamal", 24);

        // replace: Steve is in the map, so it updates his value to 45.
        people.replace("Steve", 45);
        // replace (specific): Updates Angie ONLY if her current value is 33. It is, so
        // she becomes 69.
        people.replace("Angie", 33, 69);

        System.out.println("People Map after modifications: " + people);

        System.out.println("\n--- getOrDefault checks ---");
        System.out.println("Kamal's Age: " + people.getOrDefault("Kamal", 0)); // Returns 24
        System.out.println("Nuwan's Age: " + people.getOrDefault("Nuwan", 0)); // Returns 0 (Nuwan doesn't exist)

        System.out.println("\n*** --- merge ---");
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apple", 5);

        // A new shipment arrives. If "Apples" exists, merge them (old + new).
        // If it doesn't exist, just add the new value.

        inventory.merge("Apple", 15, (oldVal, newVal) -> oldVal + newVal);
        inventory.merge("Banana", 10, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("Total Inventory: " + inventory);

        System.out.println("\n*** --- putAll ---");
        // Combining two entire maps together.
        Map<String, String> mapA = new HashMap<>();
        mapA.put("A", "Apple");

        Map<String, String> mapB = new HashMap<>();
        mapB.put("B", "Banana");
        mapB.put("C", "Cherry");
        // Dumps everything from mapB into mapA
        mapA.putAll(mapB);
        System.out.println("Combined Map: " + mapA);
        // Output: {A=Apple, B=Banana, C=Cherry}

        System.out.println("\n*** --- computeIfPresent ---");
        // Scenario: Applying a $100 discount to an item, but ONLY if it exists in the
        // store.
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 1000);
        productPrices.put("Mouse", 50);
        // The BiFunction takes the (key, currentValue) and returns the newValue.
        productPrices.computeIfPresent("Laptop", (key, val) -> val - 100);
        productPrices.computeIfPresent("Keyboard", (key, val) -> val - 10); // Keyboard doesn't exist, does nothing.
        System.out.println("Discounted Prices: " + productPrices);
        // Output: {Mouse=50, Laptop=900}

        System.out.println("*** --- computeIfAbsent ---");
        // Scenario: Grouping students by their favorite subject.
        Map<String, List<String>> subjectRoster = new HashMap<>();

        // If "Math" doesn't exist yet, it creates a new ArrayList, puts it in the map,
        // and then immediately lets us add "Amara" to it.
        subjectRoster.computeIfAbsent("Math", k -> new ArrayList<>()).add("Amara");
        subjectRoster.computeIfAbsent("Math", k -> new ArrayList<>()).add("Kamal");
        System.out.println("Subject Roster: " + subjectRoster);
        // Output: {Math=[Amara, Kamal]}

    }
}