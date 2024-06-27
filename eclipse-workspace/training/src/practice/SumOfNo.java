package practice;
import java.util.*;
public class SumOfNo {
	
	static int sum() {
		Scanner sc=new Scanner(System.in);
		String ch="y";
		int n,sum=0;
		do {
			System.out.println("Enter No. ");
			n=sc.nextInt();
			sum=sum+n;
			System.out.println("Continue y/n ");
			ch=sc.next();
		}while(ch.equals("y"));
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum is "+sum());
	}
}
