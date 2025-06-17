package addon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RankFinder {
	    public static int lowerBound(int[] arr, int target) {
	        int left = 0, right = arr.length;
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

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {14, 45, 7, 89, 10, 35, 45, 7};
	        Arrays.sort(arr);
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        
	        try {
	            System.out.print("Enter the element to find the rank: ");
	            int target = sc.nextInt();
	            
	            int pos = lowerBound(arr, target);
	            
	            if (pos < arr.length && arr[pos] == target) {
	                int rank = pos + 1;
	                System.out.println("The rank of element " + target + " is: " + rank);
	            } else {
	                System.out.println("Element " + target + " not found in the array.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input! Please enter an integer.");
	        } finally {
	            sc.close();
	        }
	    }
	}




