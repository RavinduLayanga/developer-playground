import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
        System.out.println("--- 1. Standard Mode (Insertion Order) ---");
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate overwrites, order stays the same
        capitalCities.put("USA", "Washington DC");

        // Prints exactly in the order
        System.out.println("Insertion Order: " + capitalCities);

        System.out.println("Get England: " + capitalCities.get("England"));
        System.out.println("Removed USA. Capital was: " + capitalCities.remove("USA"));
        System.out.println("Total cities remaining: " + capitalCities.size());

        System.out.println("\nLooping over Keys only:");
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nLooping over Values only:");
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // Lookup with the entrySet()
        System.out.println("\nLooping over BOTH:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " | Capital: " + entry.getValue());
        }

        capitalCities.clear();
        System.out.println("\nMap after clear: " + capitalCities);
        System.out.println("Is the map empty now? " + capitalCities.isEmpty());

        System.out.println("\n--- 2. Advanced Mode (Access Order / LRU) ---");
        // Constructor: (capacity, loadFactor, accessOrder)
        // true = Access Order (recently used items move to the back of the line)
        LinkedHashMap<String, String> recentFiles = new LinkedHashMap<>(16, 0.75f, true);

        recentFiles.put("File1", "Document.pdf");
        recentFiles.put("File2", "Image.png");
        recentFiles.put("File3", "Video.mp4");

        System.out.println("Initial File Order: " + recentFiles);

        // ACCESS "File1". Watch it move to the back!
        System.out.println("Opening... " + recentFiles.get("File1"));
        System.out.println("Order after accessing File1: " + recentFiles);

        // UPDATE "File2". Watch it also move to the back!
        recentFiles.put("File2", "Updated_Image.png");
        System.out.println("Order after updating File2: " + recentFiles);

        System.out.println("\n--- 3. Inherited HashMap Methods ---");
        Map<String, Integer> studentMarks = new LinkedHashMap<>();
        studentMarks.put("Amara", 45);
        studentMarks.put("Kamal", 65);
        studentMarks.put("Sitha", 55);
        studentMarks.put("Dumindu", 95);
        studentMarks.put("Pawani", 75);

        System.out.println("Does map have key 'Sitha'? " + studentMarks.containsKey("Sitha")); // true
        System.out.println("Does map have score 95? " + studentMarks.containsValue(95)); // true

        studentMarks.putIfAbsent("Kamal", 100); // Kamal exists, does nothing.
        studentMarks.putIfAbsent("Ruwan", 80); // Ruwan does not exist, so he gets added to the end of the line.

        studentMarks.replace("Amara", 45, 50); // Updates Amara's score from 45 to 50 safely.

        System.out.println("Nuwan's Score (Default 0): " + studentMarks.getOrDefault("Nuwan", 0));

        System.out.println("Final Student Marks (Maintains Order): " + studentMarks);
    }
}