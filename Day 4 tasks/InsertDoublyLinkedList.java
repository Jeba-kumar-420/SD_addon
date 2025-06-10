package addon;
public class InsertDoublyLinkedList {
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insert(int data, int position) {
        if (position <= 0) {
            addAtBeginning(data);
            return;
        }
        Node current = head;
        int index = 0;
        while (current != null && index < position) {
            current = current.next;
            index++;
        }
        if (current == null) {
            addAtEnd(data);
        } else {
            Node newNode = new Node(data);
            newNode.prev = current.prev;
            newNode.next = current;
            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;
            if (newNode.prev == null) {
                head = newNode;
            }
        }
    }
    public void traverse() {
        System.out.print("Traversal: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    public int size() {
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        InsertDoublyLinkedList dll = new InsertDoublyLinkedList();
        dll.addAtEnd(10);
        dll.addAtEnd(20);
        dll.addAtEnd(30);
        dll.addAtBeginning(5);
        dll.insert(15, 2);   
        dll.insert(25, 5);  
        dll.insert(0, 0); 
        dll.traverse();
        System.out.printf("List size: %d%n", dll.size());
    }
}
