package addon;

public class DeleteDoublyLinkedList {
    class Node {
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

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void delete(int key) {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }
        if (temp == head) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
        }
        System.out.println("Node with value " + key + " deleted.");
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteDoublyLinkedList dll = new DeleteDoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);

        System.out.println("Original list:");
        dll.printList();

        dll.delete(20);
        System.out.println("List after deleting 20:");
        dll.printList();

        dll.delete(50);
        System.out.println("List after deleting 50:");
        dll.printList();
    }
}
