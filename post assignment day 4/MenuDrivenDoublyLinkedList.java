package addon;
import java.util.Scanner;

public class MenuDrivenDoublyLinkedList {
    static class Node {
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
        newNode.prev = current;
    }

    public void delete(int key) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
        System.out.println("Node with value " + key + " deleted.");
    }

    public void traverseForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Doubly Linked List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.print("Doubly Linked List (Backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void display() {
        traverseForward(); 
    }

    public static void main(String[] args) {
        MenuDrivenDoublyLinkedList list = new MenuDrivenDoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Traverse Forward");
            System.out.println("4. Traverse Backward");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int valueToAdd = scanner.nextInt();
                    list.add(valueToAdd);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    list.delete(valueToDelete);
                    break;
                case 3:
                    list.traverseForward();
                    break;
                case 4:
                    list.traverseBackward();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
