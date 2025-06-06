package addon;

	import java.util.Scanner;
	import java.util.Arrays;
	public class ArrayInsertion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the element to insert: ");
	        int element = scanner.nextInt();
	        System.out.print("Enter the position to insert at (1-based index): ");
	        int position = scanner.nextInt();

	        if (position < 1 || position > size + 1) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        int[] newArr = new int[size + 1];
	        for (int i = 0; i < position - 1; i++) {
	            newArr[i] = arr[i];
	        }
	        {
	        newArr[position - 1] = element;
	        for (int i = position; i <= size; i++) {
	            newArr[i] = arr[i - 1];
	        }
	        System.out.println("Array after insertion: " + Arrays.toString(newArr));
	    }
	}
}
