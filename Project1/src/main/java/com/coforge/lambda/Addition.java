package com.coforge.lambda;

interface Addition {
    int add(int a, int b);
    public class Calculation1{
        public static void main(String[] args) {
            Addition addition1=(x,y)->x+y;
            System.out.println(addition1.add(1,2));
        }
    }
}
