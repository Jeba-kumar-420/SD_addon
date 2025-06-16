package addon;
import java.util.Arrays;

public class RotatedSortedArray {
	public static int[] rotate(int []arr,int pivot){
		 int n = arr.length;
	        int[] rotated = new int[n];

	        for (int i = 0; i < n; i++) {
	            rotated[i] = arr[(i + pivot) % n];
	        }

	        return rotated;
	    }

		
	public static int search(int []arr,int target) {
		int left = 0 , right=arr.length-1;
	
		while(left<=right) {
			int mid=(left+right)/2;
		
		
		if(arr[mid]==target) {
			return mid;
			
		}
		
		if(arr[mid]<=target) {
			if(arr[mid]<=target && target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
			else {
				if(arr[mid]>=target && target>arr[mid])
				{
					left=mid-1;
				}
				else
				{
					right=mid+1;
				}
			}
		}
		

		return -1;
		
	}
	public static void main(String[] args) {
		int []arr= {89,10,12,15,2,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int pivot=10;
		 int[] rotatedArray = rotate(arr, pivot);
	        System.out.println("Rotated version: " + Arrays.toString(rotatedArray));
 
		int target=10;
		int result=search(arr,target);
		if(result!=-1)
		{
			System.out.println("target value founded at index:"+" "+result);
		}
		else
		{
			System.out.println("target not found");
		}
	}

	}