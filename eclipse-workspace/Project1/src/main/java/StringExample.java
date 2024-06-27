
public class StringExample {
	public static void main(String[] args) {
		String s1="We are learning java";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(1));
		
		String email="coforge_akash@ymail.com";
		if(email.startsWith("coforge")) {
			if(email.endsWith(".com")) {
				if(email.contains("@")) {
					System.out.println(email+" is valid email");
				}
				else {
					System.out.println("Invalid email doesnot have @ sign");
				}
			}
			else {
				System.out.println("Invalid email does not ends with .com");
			}
		}
		else {
			System.out.println("Invalid email not starts with coforge");
		}
	}
}
