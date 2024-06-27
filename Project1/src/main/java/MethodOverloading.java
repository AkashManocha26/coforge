public class MethodOverloading {

    void addition(int a, int b){
        System.out.println("addition is "+(a+b));
    }
    void addition(int a, int b, int c){
        System.out.println("addition is "+(a+b+c));
    }
    void addition(float a, float b){
        System.out.println("addition is "+(a+b));
    }
    void addition(String a, String b){
        System.out.println("addition is "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.addition(1,2,3);
        mo.addition(1.4f,2.0f);
        mo.addition(1,2);
        mo.addition("Akash"," Manocha");
    }
}
