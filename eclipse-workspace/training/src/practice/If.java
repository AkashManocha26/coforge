package practice;

public class If {
	public static void main(String[] args) {
		float marks=45;
		
		if(marks>35) {
			System.out.println("Pass ");
		}
		else {
			System.out.println("Fail ");
		}
		String result=(marks>35?"pass":"fail");
		System.out.println(result);
	}
}
