package practice;

public class BubbleSort {
	
	static int[] bubbleSort(int ar[]){
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length-i-1; j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
	static void display(int ar[]) {
		for (int i:ar) {
			System.out.print(i+", ");
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {11,1,2,33,4,5};
		System.out.println("Unsorted array elements ");
		display(ar);
		System.out.println("\nSorted array elements ");
		display(bubbleSort(ar));
	}
}
