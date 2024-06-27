public class Employee {
    int id;
    String name;
    float salary;

    void employeeInfo(){
        System.out.println("Employee Information ");
        System.out.println("\tid "+id);
        System.out.println("\tname "+name);
        System.out.println("\tsalary "+salary);
    }
}
class Manager extends Employee{
    String location;
    int age;
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.id=1001;
        manager.name="Sumit Kumar";
        manager.salary=12000;
        manager.location="Delhi";
        manager.age=21;
        manager.employeeInfo();
        System.out.println("\tlocation "+manager.location);
        System.out.println("\tage "+manager.age);

    }
}
