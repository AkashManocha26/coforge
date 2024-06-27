package practice;
import java.util.*;
public class InterestCalculation {
//	static float interest(float amt, float rate, int time) {
//		return amt*rate*time;
//	}
//	public static void main(String[] args) {
//		float a,r;
//		int t;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Amount");
//		a=sc.nextFloat();
//		System.out.println("Enter Rate");
//		r=sc.nextFloat();
//		System.out.println("Enter Time");
//		t=sc.nextInt();
//		System.out.println(interest(a,r,t));
//		
//	
//	}
	
	static float calc() {
		Scanner sc=new Scanner(System.in);
		float amt,rate;
		int time;
		do {
			System.out.println("Enter amount>=0");
			amt=sc.nextFloat();
		}while(amt<=0);
		do {
			System.out.println("Enter rate>=0");
			rate=sc.nextFloat();
		}while(rate<=0);
		do {
			System.out.println("Enter time>=0");
			time=sc.nextInt();
		}while(time<=0);
		return (amt*rate*time)/100.0f;
	}
	
	public static void main(String[] args) {
		System.out.println("Interest is "+calc());
	}
	
	
}
	
