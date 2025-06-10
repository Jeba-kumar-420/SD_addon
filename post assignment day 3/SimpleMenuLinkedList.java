package addon;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SimpleMenuLinkedList {
    Node head = null;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            head = head.next;
        }
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleMenuLinkedList list = new SimpleMenuLinkedList();
        int choice, value;

        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    list.insertAtBeginning(value);
                    break;
                case 3:
                    list.deleteFromBeginning();
                    break;
                case 4:
                    list.deleteFromEnd();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
