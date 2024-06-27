
public class CustomerMain {
	public static void main(String[] args) {
		
		int id1[]= {20001,20002,20003};
		String nm[]= {"Pankaj","Ram","Sid"};
		float sal[]= {20000,30000,40000};
		
		Customer customer[]=new Customer[3];
//		customer[0]=new Customer();
//		customer[0].id=1;
//		customer[0].name="Amit";
//		customer[0].salary=20000;
		
		for (int i = 0; i < customer.length; i++) {
			customer[i]=new Customer();
			customer[i].id=id1[i];
			customer[i].name=nm[i];
			customer[i].salary=sal[i];
		}
		
		for (Customer customer2:customer) {
			customer2.customerInfo();
		}
	}
}
