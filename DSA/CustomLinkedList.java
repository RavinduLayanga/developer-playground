
public class CustomLinkedList {
    Node head;

    public CustomLinkedList(){
        this.head = null;
    }

    public void printList(){
        Node current = head;
        System.out.println("Current List: ");
        while(current != null){
            System.out.println(current.data + " ->");
            current =current.next;

        }
        System.out.println("null");
    }

    public void add(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String value){
        if(head == null){
            head = new Node(value);
        } else{
            printList();
        }
    }

    public void add(int index, String value){
        if(index<0){
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if(index ==0){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for(int i=0; i<index-1; i++){
            if(current ==null){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            current = current.next;

        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void remove(){
        if(head != null){
            head =head.next;
        }
    }

    public void removeFirst(){
        remove();
    }

    public void removeLast(){
        if(head ==null){
            return;
        }
        if(head.next ==null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index){
        if(index <0){
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
        for(int i=0; i<index-1;i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index Out of Bound");
            }
            current = current.next;
        }

        if(current == null || current.next == null){
           throw new IndexOutOfBoundsException("Index Out of Bound");
        }

        current.next = current.next.next;
        
    }



    public void main (String args[]){
        CustomLinkedList mylist = new CustomLinkedList();
        mylist.addLast("First");
        mylist.addLast("Second");
        mylist.printList();
    }

}

class Node {

    String data;
    Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }
}
