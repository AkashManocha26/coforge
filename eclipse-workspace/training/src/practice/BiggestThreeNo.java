package practice;

public class BiggestThreeNo {
	public static void main(String[] args) {
		int a=35;
		int b=45;
		int c=78;
		if(a>b && a>c) {
			System.out.println(a+" is biggest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is biggest");
		}
		else if(c>a && c>b) {
			System.out.println(c+" is biggest");
		}
	}
}
