/*
 * Custom Singly Linked List Implementation
 * ----------------------------------------
 * The explanatory comments within this file were AI-generated for educational reference.
 */

public class CustomLinkedList {
    Node head;

    // Constructor: Initializes an empty list
    public CustomLinkedList(){
        this.head = null;
    }

    // Prints the list horizontally (e.g., 10 -> 20 -> null)
    public void printList(){
        Node current = head;
        System.out.print("Current List: ");
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Adds a new node to the very end of the list
    public void add(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Adds a new node to the very front of the list
    public void addFirst(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Convenience method: Adding to the last spot is the same as the default add()
    public void addLast(String value){
        add(value); 
    }

    // Inserts a node at a specific index
    public void add(int index, String value){
        // Guard Clause: Prevent negative indexes
        if(index < 0){
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        // Handle insertion at the very beginning
        if(index == 0){
            addFirst(value);
            return;
        }
        
        Node newNode = new Node(value);
        Node current = head;
        
        // Walk to the node exactly one spot BEFORE the target index
        for(int i = 0; i < index - 1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;
        }
        
        // Rewire pointers to insert the new node
        newNode.next = current.next;
        current.next = newNode;
    }

    // Default remove deletes the first item (head)
    public void remove(){
        if(head != null){
            head = head.next;
        }
    }

    // Convenience method matching Java's standard library
    public void removeFirst(){
        remove();
    }

    // Deletes the very last node in the list
    public void removeLast(){
        if(head == null){
            return;
        }
        // Edge case: If there is only one item, destroy the head
        if(head.next == null){
            head = null;
            return;
        }
        
        Node current = head;
        // Stop at the SECOND TO LAST node
        while(current.next.next != null){
            current = current.next;
        }
        
        // Break the arrow to the last node
        current.next = null;
    }

    // Removes a node at a specific index
    public void remove(int index){
        // Guard Clauses for safety
        if(index < 0){
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list");
        }
        if(index == 0){
            removeFirst();
            return;
        }
        
        Node current = head;
        // Walk to the node exactly one spot BEFORE the target index
        for(int i = 0; i < index - 1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index Out of Bound");
            }
            current = current.next;
        }

        // Final safety check before jumping a node
        if(current == null || current.next == null){
           throw new IndexOutOfBoundsException("Index Out of Bound");
        }

        // Rewire the arrow to skip the target node, effectively deleting it
        current.next = current.next.next;
    }

    // Checks if a specific value exists in the list
    public boolean contains(String value){
        Node current = head;
        while(current != null){
            if (current.data.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Returns the index of a specific value, or -1 if not found
    public int indexOf(String value){
        Node current = head;
        int index = 0;
        while(current != null){
            if(current.data.equals(value)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // Counts and returns the total number of nodes in the list
    public int size(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // Reverses the direction of all arrows in the list in-place
    public void reverse(){
        Node previousNode = null;
        Node current = head;
        Node nextNode = null;

        while(current != null){
            nextNode = current.next;     // 1. Save the future
            current.next = previousNode; // 2. Flip the arrow backward
            previousNode = current;      // 3. Move 'previous' forward
            current = nextNode;          // 4. Move 'current' forward
        }
        // Update the head to point to the new front of the list
        head = previousNode;
    }

    // --- MAIN METHOD FOR TESTING ---
    public static void main(String[] args){
        System.out.println("=== Initializing List ===");
        CustomLinkedList myList = new CustomLinkedList();
        
        myList.addLast("10");
        myList.addLast("20");
        myList.add("30");
        myList.printList();
        
        System.out.println("\n=== Testing Insertions ===");
        myList.addFirst("0");
        myList.add(2, "1.5");
        myList.printList();
        
        System.out.println("\n=== Testing Search & Size ===");
        System.out.println("Size of list: " + myList.size());
        System.out.println("Contains '20'? " + myList.contains("20"));
        System.out.println("Index of '30': " + myList.indexOf("30"));
        
        System.out.println("\n=== Testing Reversal ===");
        myList.reverse();
        myList.printList();
        
        System.out.println("\n=== Testing Removals ===");
        myList.removeFirst();
        myList.removeLast();
        myList.remove(1); // Removes what is currently at index 1
        myList.printList();
    }
}

// ---------------------------------------------------------
// Node Class (The blueprint for the individual boxes)
// ---------------------------------------------------------
class Node {
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }
}