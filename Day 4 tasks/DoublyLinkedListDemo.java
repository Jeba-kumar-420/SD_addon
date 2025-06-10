package addon;

public class DoublyLinkedListDemo {
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
	    public void traverseForward() {
	        System.out.print("Forward Traversal: ");
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
	    public void traverseBackward() {
	        System.out.print("Backward Traversal: ");
	        Node current = tail;
	        while (current != null) {
	            System.out.print(current.data);
	            if (current.prev != null) {
	                System.out.print(" <-> ");
	            }
	            current = current.prev;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	DoublyLinkedListDemo dll = new DoublyLinkedListDemo();

	        dll.addAtEnd(10);
	        dll.addAtEnd(20);
	        dll.addAtEnd(30);
	        dll.addAtBeginning(5);
	        dll.traverseForward();
	        dll.traverseBackward();
	    }
	}
