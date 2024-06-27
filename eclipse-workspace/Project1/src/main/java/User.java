
public class User {
	
	private long userId;
	private String userName;
	private String userLocation;
	private static String country;
	
	
	
	public User(long userId, String userName, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}
	
	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public static String getCountry() {
		return country;
	}

	public User() {
		System.out.println("Constructor called");
	}
	
	static {
		country="India";
		System.out.println("Static block 1 called");
	}
	static {
		System.out.println("Static block 2 called");
	}
	public static void main(String[] args) {
		new User();
		new User();
		new User();
	}
}
