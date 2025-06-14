package addon;

public class StackSll {
	    private class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top;  
	    private int size; 

	    public StackSll() {
	        top = null;
	        size = 0;
	    }
	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	        size++;
	        System.out.println(data + " pushed onto stack");
	    }
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop.");
	            return -1;
	        }
	        int data = top.data;
	        top = top.next;
	        size--;
	        System.out.println(data + " popped from stack");
	        return data;
	    }
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot peek.");
	            return -1;
	        }
	        return top.data;
	    }
	    public boolean isEmpty() {
	        return top == null;
	    }
	    public int size() {
	        return size;
	    }
	    public static void main(String[] args) {
	    	StackSll stack = new StackSll();

	        stack.push(5);
	        stack.push(10);
	        stack.push(15);

	        System.out.println("Top element is: " + stack.peek());

	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());

	        System.out.println("Stack size: " + stack.size());

	        System.out.println("Is stack empty? " + stack.isEmpty());

	        stack.pop(); // Pop last element

	        System.out.println("Is stack empty after popping all? " + stack.isEmpty());
	    }
	}



