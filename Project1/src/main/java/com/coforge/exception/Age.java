package com.coforge.exception;

import java.util.Scanner;

public class Age {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws CustomException {
        if(age<19)
            throw new CustomException("Age should be grater than or equal to 19");
        else {
            System.out.println("Player is eligible");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Age age=new Age();
            String name=sc.next();
            age.setName(name);
            int a=sc.nextInt();
            age.setAge(a);
        }
        catch(CustomException e){
            System.err.println(e);
        }
    }
}
