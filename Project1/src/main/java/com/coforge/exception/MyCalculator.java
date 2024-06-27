package com.coforge.exception;

import java.util.Scanner;

public class MyCalculator {

    long power(int a, int b){

        if(a<0 || b<0)
            throw new RuntimeException("n or p should not be negative");
        if(a==0 && b==0)
            throw new RuntimeException("n and p should not be zero");

        long c= (long) Math.pow(a,b);
        return c;
    }

    public static void main(String[] args) {
        try {
            MyCalculator mc = new MyCalculator();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(mc.power(a,b));
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
    }
}
