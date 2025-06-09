package addon;

import addon.SinglyLinkedList.Node;

public class SinglyLinkedListDemo {
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    static class SinglyLinkedList {
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
	        
	        public void traverse() {
	            if (head == null) {
	                System.out.println("The list is empty.");
	                return;
	            }

	            Node current = head;
	            System.out.print("Linked List traversal: ");

	            while (current != null) {
	                System.out.print(current.data);
	                if (current.next != null) {
	                    System.out.print("  ");
	                }
	                current = current.next;
	            }
	            System.out.println();
	        }
			public void reverse() {

			}
			public void printList() {
			}
	    }
	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.traverse();	        		        
	    }
	}
