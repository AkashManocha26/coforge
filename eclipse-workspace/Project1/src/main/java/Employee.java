
public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	private static String companyName="Coforge";
	
	static int count=0;
	int c=0;
	
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		count++;
		c++;
	}
	
	public static void main(String[] args) {
		
		Employee employee=new Employee(1001,"Pawan Kumar",45000);
		Employee employee1=new Employee(1001,"Pawan Kumar",45000);
		Employee employee2=new Employee(1001,"Pawan Kumar",45000);
		
		System.out.println("Company name is "+companyName);
		System.out.println("id : "+employee.empId);
		System.out.println("name is "+employee.empName);
		System.out.println("salary is "+employee.empSalary);
		
		System.out.println("Count : "+employee.c);
		System.out.println("Count : "+employee1.c);
		System.out.println("Count : "+employee2.c);
		
	}
}
