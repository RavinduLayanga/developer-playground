import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(List.of("Volvo", "BMW", "Ford", "Mazda"));
        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> its = numbers.iterator();
        while (its.hasNext()) {
            Integer i = its.next();
            if (i < 10) {
                its.remove();
            }
        }
        System.out.println(numbers);
    }
}
