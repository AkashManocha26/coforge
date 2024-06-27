package practice;
import java.util.*;
public class Table {
	
	static void tableDisplay(int a) {
		int c=1;
		do {
			System.out.println(a+" * "+c+" = "+(c*a));
			c++;
		} while(c<=10);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. ");
		int a=sc.nextInt();
		tableDisplay(a);
		sc.close();
	}
}
