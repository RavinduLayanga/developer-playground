public class Test {
    public static void main(String[] args) {
        String a = "hello";
        a.toUpperCase();
        System.out.println(a);
        a = a.toUpperCase();
        // a.substring(int );
        System.out.println(a);

        int x = 5;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        int[] numbers = new int[5];
        String[] wors = { "haha", "hello", "cat", "rat" };

        int size = numbers.length;
        int[] reversed = new int[size];
        int j = 0;

        numbers[0] = 10;
        numbers[1] = 7;
        numbers[2] = 79;
        numbers[3] = 26;
        numbers[4] = 100;

        System.out.println("original array");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        for (int i = size - 1; i >= 0; i--) {
            reversed[j] = numbers[i];
            j++;
        }
        System.out.println("reversed array");
        // for (int num : reversed) {
        // System.out.print(num + " ");
        // }
        // int b = countOccurrenceces(numbers, 10);
        // System.out.println(b);
        reverse(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        removeAt(numbers, 3);
        System.out.println("removed array");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    static int countOccurrenceces(int[] numbers, int target) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }

    static void reverse(int[] numbers) {
        int i = 0, j = numbers.length - 1, temp = 0;
        while (i < j) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
    }

    static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (max < numbers[i]) {

                max = numbers[i];
            }
        }
        return max;
    }

    static void removeAt(int[] numbers, int index) {
        for (int i = index; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = 0;
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    int length(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;

        }

        return count;
    }

    boolean search(Node head, int target) {
        boolean exist = false;
        Node current = head;
        while (current != null) {
            if (target == current.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    Node reverse(Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
