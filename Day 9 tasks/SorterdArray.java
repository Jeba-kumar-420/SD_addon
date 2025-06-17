package addon;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SorterdArray {

	    public static int lowerBound(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static int upperBound(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {7, 10, 10, 14, 14, 14, 35, 45, 89}; // Example sorted array
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        
	        try {
	            System.out.print("Enter the target value: ");
	            int target = sc.nextInt();
	            
	            int lowerIndex = lowerBound(arr, target);
	            int upperIndex = upperBound(arr, target);
	            int count = upperIndex - lowerIndex; // Count of target
	            
	            if (count > 0) {
	                System.out.println("Count of " + target + " in the array is: " + count);
	            } else {
	                System.out.println("Target " + target + " is not present in the array.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input! Please enter an integer value for the target.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	}

