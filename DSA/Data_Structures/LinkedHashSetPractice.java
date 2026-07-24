import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        // --- String LinkedHashSet ---
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Set rejects duplicates, returns false, and keeps the original insertion order
        boolean addDuplicate = cars.add("Ford");
        System.out.println("Did the duplicate Ford get added? " + addDuplicate);

        System.out.println("Total cars: " + cars.size());
        System.out.println("Contains BMW? " + cars.contains("BMW"));

        System.out.println("Initial timeline: " + cars);

        cars.remove("Mazda");
        System.out.println("After removing Mazda: " + cars);

        cars.clear();
        System.out.println("Is cars set empty after clear? " + cars.isEmpty());

        // --- Integer LinkedHashSet ---
        System.out.println("\n--- Number Timeline ---");
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(33);
        numbers.add(11);
        numbers.add(99);
        numbers.add(53);
        numbers.add(75);

        // Iteration perfectly respects the exact order they were inserted
        for (int i : numbers) {
            System.out.println("Number: " + i);
        }

        // --- Using var ---
        System.out.println("\n--- Flowers Set ---");
        var flowers = new LinkedHashSet<String>();
        flowers.add("Orchid");
        flowers.add("Rose");
        System.out.println("Flowers set: " + flowers);

        // --- Bulk Operations (Union, Intersection, Difference) ---
        System.out.println("\n--- Bulk Operations ---");

        Set<String> myFriends = new LinkedHashSet<>(List.of("Alice", "Bob", "Charlie", "David"));
        Set<String> yourFriends = new LinkedHashSet<>(List.of("Charlie", "David", "Eve", "Frank"));

        System.out.println("My friends: " + myFriends);
        System.out.println("Your friends: " + yourFriends);

        // Union: Combines both, ignores duplicates, keeps chronological order
        Set<String> union = new LinkedHashSet<>(myFriends);
        union.addAll(yourFriends);
        System.out.println("Union (All friends): " + union);

        // Intersection: Keeps only mutual elements
        Set<String> intersection = new LinkedHashSet<>(myFriends);
        intersection.retainAll(yourFriends);
        System.out.println("Intersection (Mutual friends): " + intersection);

        // Difference: Removes elements of yourFriends from myFriends
        Set<String> difference = new LinkedHashSet<>(myFriends);
        difference.removeAll(yourFriends);
        System.out.println("Difference (My unique friends): " + difference);
    }
}