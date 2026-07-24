import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorPractice {
    public static void main(String[] args) {
        // Initialize an ArrayList and obtain its iterator
        ArrayList<String> cars = new ArrayList<>(List.of("Volvo", "BMW", "Ford", "Mazda"));
        Iterator<String> it = cars.iterator();

        System.out.println("--- Iterating over ArrayList ---");

        // Print the first element
        System.out.println("First element: " + it.next());

        // Iterate through and print the remaining elements
        System.out.println("Remaining elements:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Re-initialize the iterator to reset the cursor to the beginning of the list
        it = cars.iterator();

        while (it.hasNext()) {
            String currentCar = it.next();
            // Safely remove a specific item during iteration
            if (currentCar.equals("BMW")) {
                it.remove();
            }
        }

        // Output: [Volvo, Ford, Mazda]
        System.out.println("\nCars list after removing 'BMW':");
        System.out.println(cars);

        // Safe removal with integer conditions
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        System.out.println("\n--- Removing elements based on condition ---");
        System.out.println("Original numbers list: " + numbers);

        Iterator<Integer> its = numbers.iterator();
        while (its.hasNext()) {
            Integer i = its.next();
            // Remove numbers less than 10
            if (i < 10) {
                its.remove();
            }
        }

        // Output: [12, 23]
        System.out.println("Numbers list after removing elements < 10:");
        System.out.println(numbers);

        // Iterate over a HashSet
        Set<String> cars2 = new HashSet<>();
        cars2.add("BMW");
        cars2.add("Volvo");
        cars2.add("Ford");
        cars2.add("Mazda");

        System.out.println("\n--- Iterating over HashSet ---");
        System.out.println("Note: Order is not guaranteed in a HashSet.");

        Iterator<String> iter = cars2.iterator();
        while (iter.hasNext()) {
            String i = iter.next();
            System.out.println(i);
        }
    }
}