package com.coforge.exception;
import java.util.*;
public class ExceptionPrg3 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two no. ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println("division is "+a/b);
        }
        catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }
}
