
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book();
		book1.setIsbn(8980);
		book1.setBname("The Jungle Book");
		book1.setAuthor("Akash");
		book1.setCost(20000);
		
		System.out.println("Book data");
		System.out.println("\tisbn : "+book1.getIsbn());
		System.out.println("\tname : "+book1.getBname());
		System.out.println("\tauthor : "+book1.getAuthor());
		System.out.println("\tcost : "+book1.getCost());
	}

}
