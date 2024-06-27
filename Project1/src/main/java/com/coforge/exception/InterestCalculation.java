package com.coforge.exception;

import java.util.Scanner;

public class InterestCalculation {
    float amt;
    float rate;
    int time;
    Scanner sc;

    public InterestCalculation(){
        sc=new Scanner(System.in);
    }

    float interest(){
        System.out.println("Enter amount: ");
        amt=sc.nextFloat();
        if(amt<=0)
            throw new RuntimeException("Invalid amount");
        System.out.println("Enter rate: ");
        rate=sc.nextFloat();
        if(rate<=0)
            throw new RuntimeException("Invalid rate");
        System.out.println("Enter time: ");
        time=sc.nextInt();
        if(time<=0)
            throw new RuntimeException("Invalid time");
        return amt*rate*time/100;
    }

    public static void main(String[] args) {
        InterestCalculation ic=new InterestCalculation();
        try{
            System.out.println("Interest is "+ic.interest());
        }
        catch(RuntimeException e){
            System.err.println(e.getMessage());
        }


    }
}
