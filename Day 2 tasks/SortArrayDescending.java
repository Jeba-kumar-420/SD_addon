package addon;
	import java.util.Arrays;
	import java.util.Scanner;

	public class SortArrayDescending {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        int[] originalArray = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            originalArray[i] = scanner.nextInt();
	        }
	        Arrays.sort(originalArray);
	        int[] sortedArray = new int[size];
	        for (int i = 0; i < size; i++) {
	            sortedArray[i] = originalArray[size - 1 - i];
	        }
	        System.out.println("Sorted array in descending order:");
	        for (int value : sortedArray) {
	            System.out.print(value + " ");
	        }

	        scanner.close();
	    }
	}