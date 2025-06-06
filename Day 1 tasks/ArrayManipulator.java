package addon;
	import java.util.Scanner;

	public class ArrayManipulator {
	    static Scanner scanner = new Scanner(System.in);
	    static int[] array = new int[100]; 
	    static int size = 0; 

	    public static void main(String[] args) {
	        menu(); 
	    }

	    public static void menu() {
	        System.out.println("\n--- Array Manipulator Menu ---");
	        System.out.println("1. Insert Element");
	        System.out.println("2. Display Elements");
	        System.out.println("3. Search Element");
	        System.out.println("4. Update Element");
	        System.out.println("5. Delete Element");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                insert();
	                break;
	            case 2:
	                display();
	                break;
	            case 3:
	                search();
	                break;
	            case 4:
	                update();
	                break;
	            case 5:
	                delete();
	                break;
	            case 6:
	                System.out.println("Exiting...");
	                return; 
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }

	        menu(); 
	    }

	    public static void insert() {
	        System.out.print("Enter element to insert: ");
	        int element = scanner.nextInt();
	        array[size] = element;
	        size++;
	        System.out.println("Element inserted.");
	    }

	    public static void display() {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }
	        System.out.println("Array elements:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void search() {
	        System.out.print("Enter element to search: ");
	        int key = scanner.nextInt();
	        for (int i = 0; i < size; i++) {
	            if (array[i] == key) {
	                System.out.println("Element found at position: " + i);
	                return;
	            }
	        }
	        System.out.println("Element not found.");
	    }

	    public static void update() {
	        System.out.print("Enter position to update (0 to " + (size - 1) + "): ");
	        int pos = scanner.nextInt();
	        if (pos < 0 || pos >= size) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        System.out.print("Enter new value: ");
	        array[pos] = scanner.nextInt();
	        System.out.println("Element updated.");
	    }

	    public static void delete() {
	        System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
	        int pos = scanner.nextInt();
	        if (pos < 0 || pos >= size) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        for (int i = pos; i < size - 1; i++) {
	            array[i] = array[i + 1];
	        }
	        size--;
	        System.out.println("Element deleted.");
	    }
	}
