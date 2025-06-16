package addon;
import java.util.Scanner;
public class InputDetection {

	    public static int search(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] == target) {
	                return mid;
	            }
	            if (arr[left] <= arr[mid]) {
	                if (target >= arr[left] && target < arr[mid]) {
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            } 
	          
	            else {
	                if (target > arr[mid] && target <= arr[right]) {
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            }
	        }
	        return -1;
	    }

	    private static boolean isInteger(String s) {
	        try {
	            Integer.parseInt(s);
	            return true;
	        } catch (NumberFormatException ex) {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        int[] arr = new int[n];

	        System.out.println("Enter the rotated sorted array elements (integers):");
	        for (int i = 0; i < n; i++) {
	            String input = sc.nextLine().trim();
	            if (!isInteger(input)) {
	                System.out.println("Invalid integer input. Please restart and enter integers only.");
	                return;
	            }
	            arr[i] = Integer.parseInt(input);
	        }

	        System.out.print("Enter target to search: ");
	        String targetInput = sc.nextLine().trim();
	        if (!isInteger(targetInput)) {
	            System.out.println("Invalid target input. Please enter an integer.");
	            return;
	        }
	        int target = Integer.parseInt(targetInput);

	        int result = search(arr, target);
	        if (result != -1) {
	            System.out.println("Target found at index: " + result);
	        } else {
	            System.out.println("Target not found.");
	        }
	    }
	}
