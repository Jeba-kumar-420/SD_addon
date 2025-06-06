package addon;
	import java.util.Arrays;

	public class RemoveDuplicates {
	    public static void main(String[] args) {
	        int[] array = {2, 3, 4, 4, 5, 8, 2, 3};
	        Arrays.sort(array);
	        int n = array.length;
	        if (n == 0) return;
	        int[] tempArray = new int[n]; 
	        int j = 0; 
	        for (int i = 0; i < n; i++) {
	            if (i == 0 || array[i] != array[i - 1]) {
	                tempArray[j++] = array[i];
	            }
	        }
	        int[] uniqueArray = Arrays.copyOf(tempArray, j);
	        System.out.println("Array after removing duplicates:");
	        for (int value : uniqueArray) {
	            System.out.print(value + " ");
	        }
	    }
	}
