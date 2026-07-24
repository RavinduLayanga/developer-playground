import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaLIstSorting {
    
    public static void main (String[] args){
        
        // ==========================================
        // 1. STRING SORTING EXAMPLES
        // ==========================================
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Kia");
        cars.add(null);

        System.out.println("------ Cars: Before Sorting ------");
        for(String car : cars){
            System.out.println(car);
        }

        // Sort using Comparator directly on the list.
        // nullsFirst ensures the 'null' element doesn't crash the program and is placed at the top.
        cars.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println("\n------ Cars: nullsFirst + naturalOrder ------");
        for(String car : cars){
            System.out.println(car);
        }
        
        // Remove the null value so subsequent sorting methods that don't handle nulls won't crash
        cars.remove(null);

        // Standard Collections sort (Ascending/Alphabetical)
        Collections.sort(cars);

        System.out.println("\n------ Cars: Collections.sort (Ascending) ------");
        for(String car : cars){
            System.out.println(car);
        }

        // Standard Collections sort with reverse order (Descending/Reverse Alphabetical)
        Collections.sort(cars, Collections.reverseOrder());

        System.out.println("\n------ Cars: Collections.reverseOrder (Descending) ------");
        for(String car : cars){
            System.out.println(car);
        }

        // Chaining Comparators: Sort by string length first. 
        // If two strings have the same length (like BMW and Kia), sort them alphabetically.
        cars.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        
        System.out.println("\n------ Cars: Length THEN Alphabetical ------");
        for(String car : cars){
            System.out.println(car); 
        }

        // Custom Lambda: Sort comparing specifically the 2nd character (index 1) of each string
        cars.sort((car1, car2) -> Character.compare(car1.charAt(1), car2.charAt(1)));
        
        System.out.println("\n------ Cars: Custom Lambda (Sorted by 2nd Letter) ------");
        for(String car : cars){
            System.out.println(car);
        }


        // ==========================================
        // 2. INTEGER SORTING EXAMPLES
        // ==========================================
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        System.out.println("\n\n------ Numbers: Before Sorting ------");
        for(int number : myNumbers){
            System.out.println(number);
        }

        // Standard Collections sort (Ascending)
        Collections.sort(myNumbers);

        System.out.println("\n------ Numbers: Collections.sort (Ascending) ------");
        for(int number : myNumbers){
            System.out.println(number);
        }

        // Standard Collections sort (Descending)
        Collections.sort(myNumbers, Collections.reverseOrder());

        System.out.println("\n------ Numbers: Collections.reverseOrder (Descending) ------");
        for(int number : myNumbers){
            System.out.println(number);
        }

        // Modern approach: naturalOrder() applied directly to the list instance
        myNumbers.sort(Comparator.naturalOrder());
        
        System.out.println("\n------ Numbers: Comparator.naturalOrder() ------");
        for(int number : myNumbers){
            System.out.println(number);
        }

        // Modern approach: reverseOrder() applied directly to the list instance
        myNumbers.sort(Comparator.reverseOrder());
        
        System.out.println("\n------ Numbers: Comparator.reverseOrder() ------");
        for(int number : myNumbers){
            System.out.println(number);
        }

    }
}