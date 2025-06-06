package addon;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 7, 5, 3, 8};
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[start]) {
                    start = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
