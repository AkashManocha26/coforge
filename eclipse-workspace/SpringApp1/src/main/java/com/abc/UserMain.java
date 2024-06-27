package com.abc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.abc.model.User;

public class UserMain {

	public static void main(String[] args) {
		//BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
		//User user=factory.getBean("user1",User.class);
		BeanFactory factory=new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		User user=factory.getBean(User.class);
		
		System.out.println(user);
		System.out.println("User Data");
		System.out.println("\tid "+user.getUserId());
		System.out.println("\tname "+user.getUserName());
		System.out.println("\tsalary "+user.getUserSalary());
		
		User user1=factory.getBean(User.class);
		user1.setUserId(878787);
		user1.setUserName("Anand Kumar");
		user1.setUserSalary(34000);
		
		System.out.println("==================");
		System.out.println(user);
		System.out.println(user1);

	}

}
