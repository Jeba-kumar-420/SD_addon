package addon;

import java.util.Scanner;

public class MenuDrivenCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;
        Node prev = null;
        while (current.data != key) {
            if (current.next == head) {
                System.out.println("Node with value " + key + " not found.");
                return;
            }
            prev = current;
            current = current.next;
        }
        if (current == head && current == tail) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else {
            prev.next = current.next;
            if (current == tail) {
                tail = prev;
            }
        }
        System.out.println("Node with value " + key + " deleted.");
    }

    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
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
        MenuDrivenCircularLinkedList list = new MenuDrivenCircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete Node");
            System.out.println("4. Traverse List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the beginning: ");
                    int valueAtBeginning = scanner.nextInt();
                    list.insertAtBeginning(valueAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter value to insert at the end: ");
                    int valueAtEnd = scanner.nextInt();
                    list.insertAtEnd(valueAtEnd);
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    list.delete(valueToDelete);
                    break;
                case 4:
                    list.traverse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
