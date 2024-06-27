package practice;
import java.util.*;
public class Student {
	
	static String calculateGrade(int m1,int m2,int m3,int m4) {
		float avg=(m1+m2+m3+m4)/4;
		if (avg>=75 && avg<=100) {
			return "distinction";

		}
		else if (avg>=60 && avg<=74) {
			return "first";

		}
		else if (avg>=50 && avg<=59) {
			return "second";

		}
		else if (avg>=35 && avg<=49) {
			return "third";

		}
		else if (avg>=0 && avg<=34) {
			return "fail";

		}
		else if (m1<33 || m2<33 || m3<33 || m4<33) {
			return "fail";
		}
		return null;
		
	}
	static void display(String name,int roll,int m1,int m2,int m3,int m4,String s1,String s2,String s3,String s4,float avg,int total,String grade) {
		System.out.println("Name is "+name);
		System.out.println("Roll No. is "+roll);
		System.out.println(s1+" has "+m1);
		System.out.println(s2+" has "+m2);
		System.out.println(s3+" has "+m3);
		System.out.println(s4+" has "+m4);
		System.out.println("Total is "+total);
		System.out.println("Avg is "+avg);
		System.out.println("Grade is "+grade);
	}
	
	
	public static void main(String[] args) {
		int roll,m1,m2,m3,m4,total;
		String name,s1,s2,s3,s4,grade;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter roll no");
		roll=sc.nextInt();
		System.out.println("Enter name of subject1");
		s1=sc.next();
		System.out.println("Enter marks of subject1");
		m1=sc.nextInt();
		System.out.println("Enter name of subject2");
		s2=sc.next();
		System.out.println("Enter marks of subject2");
		m2=sc.nextInt();
		System.out.println("Enter name of subject3");
		s3=sc.next();
		System.out.println("Enter marks of subject3");
		m3=sc.nextInt();
		System.out.println("Enter name of subject4");
		s4=sc.next();
		System.out.println("Enter marks of subject4");
		m4=sc.nextInt();
		total=m1+m2+m3+m4;
		avg=total/4;
		grade=calculateGrade(m1,m2,m3,m4);
		display(name,roll,m1,m2,m3,m4,s1,s2,s3,s4,avg,total,grade);
	}
}
