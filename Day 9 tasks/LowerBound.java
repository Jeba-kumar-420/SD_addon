package addon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 45, 7, 89, 10, 35};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length;
        int mid;

        try {
            System.out.println("Enter the target value:");
            int target = sc.nextInt();

            while (left < right) {
                mid = (left + right) / 2;
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left < arr.length) {
                System.out.println("Lower bound of " + target + " Index is " + left);
            } else {
                System.out.println("Target " + target + " is out of bounds");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer value.");
        } finally {
            sc.close();
        }
    }
}
