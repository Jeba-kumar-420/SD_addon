package addon;

public class QueueOperations {
	    private int[] arr;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public QueueOperations(int capacity) {
	        this.capacity = capacity;
	        arr = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public void enqueue(int data) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + data);
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        arr[rear] = data;
	        size++;
	        System.out.println(data + " enqueued to queue");
	    }
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1; 
	        }
	        int data = arr[front];
	        front = (front + 1) % capacity;
	        size--;
	        System.out.println(data + " dequeued from queue");
	        return data;
	    }
	    public int size() {
	        return size;
	    }

	    public static void main(String[] args) {
	    	QueueOperations queue = new QueueOperations(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);
	        queue.enqueue(60);

	        System.out.println("Dequeued: " + queue.dequeue());
	        System.out.println("Dequeued: " + queue.dequeue());

	        queue.enqueue(60);
	        queue.enqueue(70);

	        System.out.println("Queue size: " + queue.size());
	        System.out.println("Is queue empty? " + queue.isEmpty());
	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued: " + queue.dequeue());
	        }

	        System.out.println("Is queue empty after dequeuing all? " + queue.isEmpty());
	    }
	}

