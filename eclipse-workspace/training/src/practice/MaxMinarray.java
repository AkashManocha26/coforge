package practice;
import java.util.*;
public class MaxMinarray {
	
	static int[] display(int arr[]) {
		int sum=0,max=arr[0],min=arr[0];
		

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			else if(arr[i]<=min) {
				min=arr[i];
			}
			sum=sum+arr[i];
		}
		int result[]= {min,max,sum};
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 No. ");
		int ar[]=new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int arr[]=display(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
		System.out.println("Min is "+arr[0]);
		System.out.println("Max is "+arr[1]);
		System.out.println("Sum is "+arr[2]);
	}
}
