package com.coforge.lambda;

public interface Calculation {
    void addition(int a, int b);
    void subtraction(int a, int b);
}
class Outer1{
    private Calculation calc=new Calculation() {
        @Override
        public void addition(int a, int b) {
            System.out.println("Addition is "+(a+b));
        }

        @Override
        public void subtraction(int a, int b) {
            System.out.println("Subtraction is "+(a-b));
        }
    };

    public static void main(String[] args) {
        Outer1 outer1=new Outer1();
        outer1.calc.addition(11,22);
        outer1.calc.subtraction(110,22);
    }
}
