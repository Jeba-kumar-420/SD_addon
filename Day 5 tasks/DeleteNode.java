package addon;

public class DeleteNode {

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

    public DeleteNode() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
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

    public void deleteNode(int position) {
        if (head == null || position < 0 || position >= size) return;

        if (position == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == head) tail = current;
        }
        size--;
    }

    public void display() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        System.out.print("Original List: ");
        list.display();

        list.deleteNode(1);
        System.out.print("After deleting at position 1: ");
        list.display();

        list.deleteNode(0);
        System.out.print("After deleting at position 0: ");
        list.display();

    }
}
