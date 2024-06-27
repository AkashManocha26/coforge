package com.abc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.config.AppConfig;
import com.abc.dao.ProductDaoImpl;
import com.abc.model.Product;

public class ProductMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDaoImpl dao=applicationContext.getBean(ProductDaoImpl.class);



		Scanner sc=new Scanner(System.in);
		System.out.println("Add record operation ");

		System.out.println("Enter book name and cost ");
		Product product=new Product();

//		product.setBname("spring in action");
//		product.setCost(1324.45f);

		product.setBname(sc.nextLine());
		product.setCost(sc.nextFloat());

		Product product2=dao.addProduct(product);

		if(product2!=null)
			System.out.println("product added is \n"+product2);
		else
			System.out.println("some error ");

		System.out.println("\nSearch Record Operation ");
		System.out.println("Enter product id ");

		Product searchProduct=dao.searchProduct(sc.nextLong());

		if(searchProduct==null)
			System.out.println("Product not found with given id ");
		else
			System.out.println("Product found with given id \n"+searchProduct);

		System.out.println("\nShow all Record operation");

		dao.getAllProduct().forEach(a->System.out.println(a));
	}
}
