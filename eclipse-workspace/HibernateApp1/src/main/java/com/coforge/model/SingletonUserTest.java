package com.coforge.model;

public class SingletonUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=User.getUser();
		user1.setUserId(1001);
		user1.setUserName("Akash Manocha");
		
		User user2=User.getUser();
		user2.setUserId(1002);
		user2.setUserName("Harsh Chauhan");
		
		
		System.out.println("User 1 Information ");
		System.out.println("\tId "+user1.getUserId());
		System.out.println("\tName "+user1.getUserName());
		System.out.println("User 2 Information");
		System.out.println("\tId "+user2.getUserId());
		System.out.println("\tName "+user2.getUserName());
	}

}
