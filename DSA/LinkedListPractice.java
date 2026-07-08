import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        
        System.out.println("=== Java LinkedList Practice ===");

        // Using the diamond operator <> on the right side
        LinkedList<String> vehicles = new LinkedList<>();

        /* =========================================
           PART 1: Standard List Methods
           ========================================= */
        System.out.println("\n--- 1. Standard List Operations ---");
        vehicles.add("car");
        vehicles.add("van");
        vehicles.add("bus");
        System.out.println("Initial vehicles: " + vehicles);

        vehicles.add(2, "bike");
        System.out.println("After adding 'bike' at index 2: " + vehicles);

        vehicles.set(0, "truck");
        System.out.println("After replacing index 0 with 'truck': " + vehicles);
        
        System.out.println("Vehicle list size: " + vehicles.size());

        System.out.println("Item at index 0: " + vehicles.get(0));
        System.out.println("Index of 'van': " + vehicles.indexOf("van"));
        System.out.println("Does the list contain 'bus'? " + vehicles.contains("bus")); // Added .contains()

        /* =========================================
           PART 2: Deque Superpowers (First/Last)
           ========================================= */
        System.out.println("\n--- 2. Deque (Double-Ended) Operations ---");
        vehicles.addFirst("Jeep");
        System.out.println("After addFirst('Jeep'): " + vehicles);
        
        vehicles.addLast("Airplane");
        System.out.println("After addLast('Airplane'): " + vehicles);

  
        System.out.println("The first item is: " + vehicles.getFirst());
        System.out.println("The last item is: " + vehicles.getLast());

        // Removing elements
        vehicles.remove(); // By default, standard .remove() removes the Head (index 0)
        System.out.println("After standard .remove(): " + vehicles);
        
        vehicles.remove("bike"); // Added removal by exact object name
        System.out.println("After .remove('bike'): " + vehicles);

        vehicles.removeFirst();
        System.out.println("After removeFirst(): " + vehicles);
        
        vehicles.removeLast();
        System.out.println("After removeLast(): " + vehicles);

        /* =========================================
           PART 3: The "Queue" Hat (FIFO)
           ========================================= */
        System.out.println("\n--- 3. Queue Operations (Line at a store) ---");
        vehicles.clear();
        if(vehicles.isEmpty()) {
            System.out.println("List cleared for Queue practice.");
        }

        // offer() adds to the back of the line
        vehicles.offer("car");
        vehicles.offer("van");
        vehicles.offer("bus");
        vehicles.offer("ship");
        vehicles.offer("bike");
        System.out.println("Queue created: " + vehicles);

        // poll() removes from the front of the line
        System.out.println("Customer served (poll): " + vehicles.poll()); 
        System.out.println("Queue after poll: " + vehicles);
        
        vehicles.pollFirst();
        System.out.println("Queue after pollFirst: " + vehicles);
        
        vehicles.pollLast(); // Removes from the back
        System.out.println("Queue after pollLast: " + vehicles);

        /* =========================================
           PART 4: The "Stack" Hat (LIFO)
           ========================================= */
        System.out.println("\n--- 4. Stack Operations (Stack of plates) ---");
        vehicles.clear();

        // push() adds to the TOP (front) of the stack
        vehicles.push("car");
        vehicles.push("van");
        vehicles.push("bus");
        vehicles.push("ship");
        vehicles.push("bike");
        System.out.println("Stack created: " + vehicles);

        // pop() removes from the TOP (front) of the stack
        System.out.println("Plate removed (pop): " + vehicles.pop());
        System.out.println("Stack after pop: " + vehicles);
        
        /* =========================================
           PART 5: Peeking
           ========================================= */
        System.out.println("\n--- 5. Peeking (Looking without removing) ---");
        System.out.println("Peek (Top/Front): " + vehicles.peek());
        System.out.println("Peek First: " + vehicles.peekFirst());
        System.out.println("Peek Last (Bottom/Back): " + vehicles.peekLast());
        System.out.println("Final list state (unchanged by peeking): " + vehicles);

        /* =========================================
           PART 6: Bulk Operations & Initialization
           ========================================= */
        System.out.println("\n--- 6. Bulk Adding & Initialization ---");
        
        // Initializing a new LinkedList with items already inside it using List.of()
        LinkedList<Integer> numbers = new LinkedList<>(List.of(10, 20, 30, 40));
        System.out.println("Newly initialized numbers list: " + numbers);

        // Dumping multiple new items into our existing vehicles list using .addAll()
        vehicles.addAll(List.of("Helicopter", "Submarine", "Scooter"));
        System.out.println("Vehicles after .addAll(): " + vehicles);
    
    }


    // comments and some print statements have been added using the Gemini to enhance clarity annd understanding of the code's functionality.
}