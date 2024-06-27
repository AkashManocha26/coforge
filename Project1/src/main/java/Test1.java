public class Test1 {
    int x=10;
    void display(String s){
        System.out.println("Test1 display method");
        System.out.println("I m "+s);


    }
    static void show(){
        System.out.println("super classs static show method");
    }
}
class Test2 extends Test1{
    int x=100;
    void display(String s){
        int x=1000;
        super.display("suresh kumar");
        System.out.println("Test 2 display method");
        System.out.println("My Name is "+s);
        System.out.println("Local x is "+x);
        System.out.println("current class x is "+this.x);
        System.out.println("Super class x is "+super.x);
    }
    static void show(){
        System.out.println("sub classs static show method");
    }


    public static void main(String[] args) {
        new Test2().display("madan Kumar");
        Test1.show();
    }
}