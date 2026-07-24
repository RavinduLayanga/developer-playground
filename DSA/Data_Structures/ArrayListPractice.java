import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        System.out.println("=== Java ArrayList Practice ===");

        // 1. Initializing ArrayLists
        ArrayList<String> cars = new ArrayList<>();
        
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 45, 67));

        // 2. Adding elements to the end of the list
        cars.add("Volvo");
        cars.add("Audi");

        System.out.println("\n--- Initial Cars List ---");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // 3. Clearing a list and checking if it is empty
        cars.clear();
        if (cars.isEmpty()) {
            System.out.println("\nStatus: The Cars ArrayList is currently empty.");
        }
        
        // 4. Adding single and multiple elements
        numbers.add(1);
        cars.addAll(List.of("BMW", "Toyota", "Ferrari"));
        
        System.out.println("\n--- Cars List after .addAll() ---");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // 5. Updating an element (Replacing "Ferrari" at index 2)
        cars.set(2, "Lamborghini");

        System.out.println("\n--- Cars List after .set() ---");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // 6. Removing an element by its index
        numbers.remove(2); // Removes the element at index 2 (which is 67)
        System.out.println("\nNumbers array size after removal: " + numbers.size());

        // 7. Using the modern 'var' keyword for list creation
        var flowers = new ArrayList<String>();
        flowers.add("Rose");
        flowers.add("Lilly");

        // Using an Enhanced For-Loop (For-Each loop) for cleaner syntax
        System.out.println("\n--- Flowers List (Enhanced For-Loop) ---");
        for (String flower : flowers) {
            System.out.println(flower);
        }

        // 8. Sorting an ArrayList using the Collections framework
        Collections.sort(numbers);

        System.out.println("\n--- Sorted Numbers List ---");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 9. Searching an ArrayList (Note: searches are case-sensitive!)
        boolean hasLilly = flowers.contains("Lilly");
        int indexOfLilly = flowers.indexOf("Lilly");

        System.out.println("\n--- Search Results ---");
        System.out.println("Does the list contain 'Lilly'? " + hasLilly);

        System.out.println("flower List: " +flowers);
        
        // Ensure the item exists before trying to get it
        if (indexOfLilly != -1) { 
            System.out.println("Lilly is located at index: " + indexOfLilly);
            System.out.println("Retrieving by index: " + flowers.get(indexOfLilly));
        }
    }
}