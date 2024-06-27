public class Animal {
    void speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meeeeooowwwwwww");
    }
}
class Horse extends Animal{
    void speak(){
        System.out.println("Horse neighs");
    }
}
class AnimalMain{
    public static void main(String[] args) {
        Animal animal;
        animal=new Dog();
        animal.speak();
        animal=new Cat();
        animal.speak();
        animal=new Horse();
        animal.speak();
    }
}