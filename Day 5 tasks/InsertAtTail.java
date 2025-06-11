package addon;

public class InsertAtTail {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public InsertAtTail() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        InsertAtTail cll = new InsertAtTail();

        cll.insertAtTail(10);
        cll.insertAtTail(20);
        cll.insertAtTail(30);
        cll.insertAtTail(40);

        cll.display();
        System.out.println("Size: " + cll.size());

        InsertAtTail emptyList = new InsertAtTail();
        emptyList.display();
        System.out.println("Size of empty list: " + emptyList.size());
    }
}
