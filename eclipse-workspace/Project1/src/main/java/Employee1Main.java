import java.util.*;
public class Employee1Main {
	static Scanner sc=new Scanner(System.in);
	
	public static Employee1 getEmployeeDetails() {
		Employee1 employee1=new Employee1();
		
		System.out.println("Enter id: ");
		employee1.setEmployeeId(sc.nextInt());
		
		System.out.println("Enter name: ");
		employee1.setEmployeeName(sc.next());
		
		System.out.println("Enter salary: ");
		employee1.setSalary(sc.nextDouble());
		return employee1;
	}
	public static int getPFPercentage(){
		System.out.println("Enter PF percentage: ");
		return sc.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 employee1=getEmployeeDetails();
		employee1.calculateNetSalary(getPFPercentage());
		
		System.out.println("Id : "+employee1.getEmployeeId());
		System.out.println("Name :"+employee1.getEmployeeName());
		System.out.println("Salary : "+employee1.getSalary());
		System.out.println("Net Salary : "+employee1.getNetSalary());
	}

}
