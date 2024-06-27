package practice;

public class SumOfDigit {
	
	static int sum(int d) {
		int s=0;
		int digit=0;
		while(d!=0) {
			digit=d%10;
			d=d/10;
			s=s+digit;
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Sum of 1234 is: "+sum(1234));
	}
}
