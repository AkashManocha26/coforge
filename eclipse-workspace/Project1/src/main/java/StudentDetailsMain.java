import java.util.Scanner;

public class StudentDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter address: ");
		String address=sc.next();
		System.out.println("From NIT college y/n? ");
		String input=sc.next();
		
		if(input.equals("y")) {
			
			StudentDetails student=new StudentDetails(id,name,address);
			System.out.println("Student Details ");
			System.out.println("\tid : "+student.getStudentId());
			System.out.println("\tname : "+student.getStudentName());
			System.out.println("\taddress : "+student.getStudentAddress());
			System.out.println("\tcollege : "+student.getCollegeName());
		}
		else {
			
			System.out.println("Enter college name: ");
			String college=sc.next();
			StudentDetails student=new StudentDetails(id,name,address,college);
			System.out.println("Student Details ");
			System.out.println("\tid : "+student.getStudentId());
			System.out.println("\tname : "+student.getStudentName());
			System.out.println("\taddress : "+student.getStudentAddress());
			System.out.println("\tcollege : "+student.getCollegeName());
		}
		
		
	}

}
