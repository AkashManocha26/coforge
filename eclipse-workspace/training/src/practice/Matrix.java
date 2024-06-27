package practice;
import java.util.*;
public class Matrix {
	
	static void display(int ar[][]) {
		System.out.println("Using for loop");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j]+", ");
			}
			System.out.println();
		}
	}
	
	static int[][] sum(int ar[][], int ar1[][]){
		int ar3[][]=new int[ar.length][ar[0].length];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar3[i][j]=ar[i][j]+ar1[i][j];
			}
		}
		return ar3;
	}
	
	static void display1(int ar[][]) {
		System.out.println("Using for each loop");
		for (int[] is:ar) {
			for (int is2:is) {
				System.out.print(is2+", ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int arr1[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println("No. of rows "+arr.length);
		System.out.println("No. of columns "+arr[0].length);
		display(arr);
		display1(arr);
		System.out.println("Sum of matrix is ");
		display1(sum(arr,arr1));
		
}
}
