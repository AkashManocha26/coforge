package com.coforge.exception;

public class ExceptionPrg2 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        int ar[]={1,2,3,4,5};
        String name=null;
        try{
            System.out.println("Name length is "+name.length());

        }

        catch(ArithmeticException e){
            System.err.println("Divided by zero\n"+e.getMessage());
        }
        catch(NullPointerException e){
            System.err.println("Null error\n"+e.getMessage());
        }

        catch(Exception e){
            System.out.println("Some error "+e.getMessage());
        }
        try{

            System.out.println(ar[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index error\n"+e.getMessage());
        }
        System.out.println("Program ends");
    }
}
