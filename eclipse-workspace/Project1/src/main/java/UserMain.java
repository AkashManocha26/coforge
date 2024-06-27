
public class UserMain {
	public static void main(String[] args) {
		User user1=new User(1,"Prince Kumar","Delhi");
		User user2=new User(2,"Praveen Kumar","Mathura");
		User user3=new User(3,"Somesh Kumar","Chennai");
		
		System.out.println("User 1 Data");
		System.out.println("\tid : "+user1.getUserId());
		System.out.println("\tname : "+user1.getUserName());
		System.out.println("\tlocation : "+user1.getUserLocation());
		
		System.out.println("Country is "+User.getCountry());
		
		System.out.println("PI is "+Math.PI);
		System.out.println("E is "+Math.E);
		System.out.println("Sin 90 is "+Math.sin(Math.PI/2));
		System.out.println();
	}
}
