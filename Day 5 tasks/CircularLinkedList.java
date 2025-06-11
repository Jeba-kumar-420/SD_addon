package addon;

public class CircularLinkedList {
	Node last;
	
	class Node {
		int data;
		Node next;
		
		Node(int num){
			data = num ;
			next=null;
		}
	}
	public CircularLinkedList() {
		last=null;
	}
		public void insert (int num) {
			Node newnode=new Node (num);
			if (last==null) {
				last=newnode ;
				newnode.next=last;
			}else {
				newnode.next=last.next;
				last.next=newnode;
				newnode=last;
			}
		}
		public void display() {
			Node temp=last.next;
			do {
				System.out.println(temp.data +"");
				temp=temp.next;
			}
			while(temp != last.next);
				
			
			System.out.println();
		}
		public static void main(String[] args) {
			CircularLinkedList s=new CircularLinkedList();
			s.insert(3);
			s.insert(4);
			s.insert(7);
		    s.display();
		}
		
	}

