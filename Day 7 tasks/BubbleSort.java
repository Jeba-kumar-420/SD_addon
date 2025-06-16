package addon;

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

		public static void findbubble(int []val) {
			System.out.println(Arrays.toString(val));
			
			for(int i=1;i<val.length;i++) {
				for(int j=0;j<val.length-1;j++) {
					
					if(val[j]>val[j+1]) {
					
					int temp=val[j];
					val[j]=val[j+1];
					val[j+1]=temp;
					
					}
					
				}
			}
			System.out.println(Arrays.toString(val));
			
		}
		

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int []arr=new int[6];
			System.out.println("Enter the value:");
			for(int k=0;k<arr.length;k++) {
			arr[k]=sc.nextInt();
			}
			findbubble(arr);
		

	}
	}
