package addon;
import java.util.Arrays;

	public class TwoSum {
	    public static void main(String[] args) {
	        int[] example = {4, 5, 2, 6, 9, 10};
	        int target = 8;
	        int[] result = findTwoSum(example, target);
	        
	        if (result != null) {
	            System.out.println("Numbers found: " + result[0] + " and " + result[1]);
	        } else {
	            System.out.println("No two numbers found that sum to " + target);
	        }
	    }
	    public static int[] findTwoSum(int[] nums, int target) {   
	        Arrays.sort(nums);	        
	        int left = 0;
	        int right = nums.length - 1;	        
	        while (left < right) {
	            int sum = nums[left] + nums[right];
	            if (sum == target) {
	                return new int[] {nums[left], nums[right]};
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }	        
	        return null;	   
	        }
	}
