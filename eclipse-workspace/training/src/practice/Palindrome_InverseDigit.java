package practice;

public class Palindrome_InverseDigit {
	static int inverse(int d) {
		int s=0;
		int digit=0;
		while(d!=0) {
			digit=d%10;
			d=d/10;
			s=s*10+digit;
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		int p=12321;
		System.out.println("reverse is "+inverse(p));
		System.out.println("is palindrome "+(inverse(p)==p));
	}
}
