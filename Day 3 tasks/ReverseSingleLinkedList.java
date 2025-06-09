package addon;

public class ReverseSingleLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("(empty list)");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print("  ");
            current = current.next;
        }
        System.out.println();
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   
            current.next = prev;   
            prev = current;         
            current = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseSingleLinkedList list = new ReverseSingleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);	        
        System.out.println("Original List:");
        list.printList();
        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
}