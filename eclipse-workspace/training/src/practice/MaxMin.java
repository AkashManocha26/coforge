package practice;
import java.util.*;
public class MaxMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int counter=1;
		int sum=0;
		int max=0;
		int min=0;
		while(counter<10) {
			System.out.println("Enter number: ");
			n=sc.nextInt();
			if(counter==1) {
				max=min=n;
			}
			else if(n>max) {
				max=n;
			}
			else if(n<min) {
				min=n;
			}
			sum=sum+n;
			counter++;
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		System.out.println("sum is "+sum);
	}
}
