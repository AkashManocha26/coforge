
public class Student {
	int roll;
	String name;
	String subject;
	
	void study() {
		System.out.println("student is studying from 9 am to 2 pm ");
	}
	public static void main(String[] args) {
		Student student1=new Student();
		student1.study();
		student1.name="Akash";
		student1.roll=21;
		student1.subject="Maths";
		System.out.println("Roll is "+student1.roll);
		System.out.println("Name is "+student1.name);
		System.out.println("Subject is "+student1.subject);
		
	}
}
