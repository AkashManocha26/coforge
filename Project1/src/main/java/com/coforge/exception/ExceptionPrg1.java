package com.coforge.exception;

public class ExceptionPrg1 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        System.out.println(ar[4]);
        //System.out.println(ar[5]);

        System.out.println(10.0f/0);
        //System.out.println(10/0);

        String name=null;
        //System.out.println("length "+name.length());

        String city="new delhi";
        System.out.println(city.charAt(20));

        System.out.println("program ends");
    }
}
