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
    }
}