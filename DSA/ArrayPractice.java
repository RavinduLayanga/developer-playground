package DSA;

import java.util.Arrays;

public class ArrayPractice { 
    public static void main(String[] args) {
        
        // Example usage of arrays
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Modify Array");
        numbers[2] = 10; // Modifying an element in the array
        for (int number : numbers) {
            System.out.println(number);
        }
    

        int numOfElements = numbers.length;
        System.out.println("Array length: " + numOfElements);

        // 4. Now this will perfectly use the imported java.util.Arrays tool!
        Arrays.sort(numbers); 
        System.out.println("After sorting:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Array reverse 
        for( int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        Arrays.fill(numbers, 0); 
        System.out.println("After filling with 0:");
        
        for (int number : numbers) {
            System.out.print(number);
        }

        
    }
}