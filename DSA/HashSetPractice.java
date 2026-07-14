import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        
        // --- String Set Practice ---
        Set<String> cars = new HashSet<>();

        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        
        // Sets reject duplicates, so adding "BMW" again returns false
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

        // Using var for type inference (Java 10+)
        var flowers = new HashSet<String>();
        flowers.add("Rose");
    }
}