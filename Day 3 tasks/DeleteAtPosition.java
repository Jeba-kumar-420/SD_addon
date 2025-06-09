package addon;

public class DeleteAtPosition {
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	        }
	    }
	    Node head;
	    void add(int data) {
	        Node n = new Node(data);
	        if (head == null) {
	            head = n;
	            return;
	        }
	        Node cur = head;
	        while (cur.next != null) cur = cur.next;
	        cur.next = n;
	    }
	    void deleteAt(int pos) {
	        if (head == null) return;
	        if (pos == 0) {
	            head = head.next;
	            return;
	        }
	        Node cur = head;
	        for (int i = 0; i < pos - 1; i++) {
	            if (cur == null || cur.next == null) return;
	            cur = cur.next;
	        }
	        if (cur.next == null) return;
	        cur.next = cur.next.next;
	    }
	    void printList() {
	        Node cur = head;
	        while (cur != null) {
	            System.out.print(cur.data);
	            if (cur.next != null) System.out.print("  ");
	            cur = cur.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	DeleteAtPosition list = new DeleteAtPosition();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        System.out.println("Original list:");
	        list.printList();
	        list.deleteAt(0);
	        System.out.println("After deleting position 0:");
	        list.printList();
	        list.deleteAt(1);
	        System.out.println("After deleting position 2:");
	        list.printList();
	    }
	}