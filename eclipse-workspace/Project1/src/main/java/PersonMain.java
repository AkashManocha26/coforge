
public class PersonMain {
	public static void main(String[] args) {
		Address address=new Address(889,"Agra","UP");
		Person person=new Person(1,"Sudhanshu Kumar",45,address);
		
		System.out.println("Person Data");
		
		System.out.println("\tid "+person.getPersonId());
		System.out.println("\tname "+person.getPersonName());
		System.out.println("\tage "+person.getPersonAge());
		System.out.println("\taddress "+person.getAddress().getAddCity());
	}
}
