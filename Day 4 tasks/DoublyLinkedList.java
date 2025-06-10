package addon;

public class DoublyLinkedList {
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
		        private Node prev;
		        public void add(int data) {
		            Node newNode = new Node(data);

		            if (head == prev) {
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
		        
		        public void traverse() {
		            if (head == null) {
		                System.out.println("The list is empty.");
		                return;
		            }

		            Node current = head;
		            System.out.print("Doubly Linked List traversal: ");

		            while (current != null) {
		                System.out.print(current.data);
		                if (current.next != null) {
		                    System.out.print(" <-> ");
		                }
		                current = current.next;
		            }
		            System.out.println();
		        }
				public void reverse() {
					if (head==null) {
						System.out.println("This list is empty :");
						return;
				}
					Node current = head;
					Node temp=null;
					
					 while (current != null) {
				            temp = current.prev;
				            current.prev = current.next;
				            current.next = temp;
				            current = current.prev;
					 }
					 if (temp != null) {
						 head = temp.prev;
					 }
				}
				public void printList () {
					traverse();
				}
		    public static void main(String[] args) {
		    	DoublyLinkedList list = new DoublyLinkedList();
		        list.add(10);
		        list.add(20);
		        list.add(30);
		        list.add(40);
		        list.add(50);
		        list.traverse();
		        list.reverse();
		        System.out.println("Reversed");
		        list.printList();
		    }
		}




