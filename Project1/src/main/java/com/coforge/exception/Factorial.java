package com.coforge.exception;

import java.util.Scanner;

public class Factorial {
    Scanner sc=new Scanner(System.in);
    long getFactorial()throws Exception{
        System.out.println("Enter no. ");
        int p= sc.nextInt();
        if(p<=0)
            try{
                throw new RuntimeException("Invalid No. ");
            }
            catch(Exception e){
                System.err.println("Error at factorial method "+e.getMessage());
                throw e;
        }
        else {
            long fact = 1;
            for (int i = 1; i <= p; i++) {
                fact = fact * i;
            }
            return fact;
        }

    }

    public static void main(String[] args) {
        System.out.println("Program starts");
        try {
            System.out.println("Factorial is "+new Factorial().getFactorial());
        }
        catch(Exception e){
            System.err.println("Error at main method "+e.getMessage());
        }
        System.out.println("Program ends");
    }
}
