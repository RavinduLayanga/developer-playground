import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        // --- String Set Practice ---
        Set<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");

        boolean addedSecondBMW = cars.add("BMW");
        System.out.println("Did the Set accept the second BMW? " + addedSecondBMW);

        System.out.println("Initial Cars Set: " + cars);
        System.out.println("Does the set contain Mazda? " + cars.contains("Mazda"));

        cars.remove("Volvo");
        System.out.println("Cars Set after removing Volvo: " + cars);

        System.out.println("\nIterating through cars:");
        for (String car : cars) {
            System.out.println("- " + car);
        }

        cars.clear();

        System.out.println("\nAfter Clear, is the cars set empty? " + cars.isEmpty());
        System.out.println("Cars set contents: " + cars);

        // --- Integer Set Practice ---
        System.out.println("\n-----------------------------");

        Set<Integer> numbers = new HashSet<>();

        numbers.add(20);
        numbers.add(49);
        numbers.add(2);
        numbers.add(113);
        numbers.add(72);

        System.out.println("Total numbers in the set: " + numbers.size());

        System.out.println("\nPrinting all actual values stored in the numbers Set:");
        for (Integer num : numbers) {
            System.out.println("Value in set: " + num);
        }

        // --- Bulk Operations (Union, Intersection, Difference) ---
        System.out.println("\n--- Bulk Operations ---");
        Set<String> groupA = new HashSet<>(List.of("Alice", "Bob", "Charlie"));
        Set<String> groupB = new HashSet<>(List.of("Charlie", "David", "Eve"));

        // Union: Combines both, ignores duplicates
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union of A and B: " + union);

        // Intersection: Keeps only mutual elements
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection (Mutual): " + intersection);

        // Difference: Removes elements of B from A
        Set<String> difference = new HashSet<>(groupA);
        difference.removeAll(groupB);
        System.out.println("Difference (In A but not B): " + difference);

        // Using var for type inference (Java 10+)
        var flowers = new HashSet<String>();
        flowers.add("Rose");
    }
}