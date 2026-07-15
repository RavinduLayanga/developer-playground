import java.util.List;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        // --- String TreeSet Practice ---
        TreeSet<String> vehicles = new TreeSet<>();
        vehicles.add("BMW");
        vehicles.add("Volvo");
        vehicles.add("Ferrari");
        vehicles.add("Audi");

        System.out.println("--- Testing TreeSet Rules ---");
        boolean addDuplicate = vehicles.add("BMW");
        System.out.println("Did the duplicate BMW get added? " + addDuplicate);

        System.out.println("Initial sorted vehicles: " + vehicles);
        System.out.println("Total vehicles: " + vehicles.size());

        vehicles.remove("Audi");
        System.out.println("After removing Audi: " + vehicles);

        System.out.println("Does the Treeset contain Volvo? " + vehicles.contains("Volvo"));

        vehicles.clear();
        System.out.println("After clearing, is vehicles empty? " + vehicles.isEmpty());

        // --- Integer TreeSet & Unique Methods ---
        System.out.println("\n--- Integer TreeSet Superpowers ---");

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(33);
        numbers.add(11);
        numbers.add(99);
        numbers.add(53);
        numbers.add(75);

        System.out.println("Sorted numbers: " + numbers);

        // The highly optimized Navigation Methods
        System.out.println("Lowest number: " + numbers.first());
        System.out.println("Highest number: " + numbers.last());
        System.out.println("Number just below 50: " + numbers.lower(50));
        System.out.println("Number just above 50: " + numbers.higher(50));
        System.out.println("Reverse order: " + numbers.descendingSet());

        System.out.println("\nIterating through numbers:");
        for (int number : numbers) {
            System.out.println("- " + number);
        }

        // --- Bulk Operations (Union, Intersection, Difference) ---
        System.out.println("\n--- Bulk Operations ---");
        TreeSet<Integer> setA = new TreeSet<>(List.of(10, 20, 30, 40));
        TreeSet<Integer> setB = new TreeSet<>(List.of(30, 40, 50, 60));

        // Union: Combines both, perfectly sorted
        TreeSet<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("Union (Sorted): " + union);

        // Intersection: Mutual numbers, perfectly sorted
        TreeSet<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection (Sorted): " + intersection);

        // Difference: Numbers in setA not in setB, perfectly sorted
        TreeSet<Integer> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (Sorted): " + difference);

        // --- Java 10+ var Keyword ---
        System.out.println("\n--- Using var ---");
        var flowers = new TreeSet<String>();
        flowers.add("Orchid");
        flowers.add("Rose");
        System.out.println("Flowers set: " + flowers);
    }
}