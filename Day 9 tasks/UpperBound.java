package addon;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UpperBound {

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
	        int[] arr = {14, 45, 7, 89, 10, 35};
	        Arrays.sort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        
	        try {
	            System.out.print("Enter the target value: ");
	            int target = sc.nextInt();
	            
	            int ubIndex = upperBound(arr, target);
	            
	            if (ubIndex < arr.length) {
	                System.out.println("Upper bound of " + target + " is at index: " + ubIndex);
	                System.out.println("Element at upper bound index: " + arr[ubIndex]);
	            } else {
	                System.out.println("Target " + target + " is out of bounds (greater than or equal to all elements in the array).");
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


