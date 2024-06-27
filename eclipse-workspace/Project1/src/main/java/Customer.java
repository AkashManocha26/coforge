
public class Customer {
	int id;
	String name;
	float salary;
	
	void customerInfo() {
		System.out.println("Customer Information");
		System.out.println("\tid : "+id);
		System.out.println("\tname : "+name);
		System.out.println("\tsalary : "+salary);
	}
	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		
		c1.id=1;
		c1.name="Amit";
		c1.salary=20000;
		
		c2.id=2;
		c2.name="Aman";
		c2.salary=40000;
		
		c3.id=3;
		c3.name="Amrit";
		c3.salary=30000;
		
		c1.customerInfo();
		c2.customerInfo();
		c3.customerInfo();
	}
}
