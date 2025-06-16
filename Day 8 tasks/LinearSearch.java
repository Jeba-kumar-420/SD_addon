package addon;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main (String []args) {
		int []arr= {23,4,6,78,54,99,1};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to be find:");
		int f=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==f) {
				System.out.println("Value find:" + arr[i] + "at index" + i);
				flag=true;
				break;
			}
		}
			if(flag==false) {
			System.out.println("Value not found");
		}
   }
}
