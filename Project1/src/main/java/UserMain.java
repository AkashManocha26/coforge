public class UserMain {
    public static void main(String[] args) {
        User user=new User(1001,"Ram Kumar",12000);

        System.out.println("User Information ");
        System.out.println("\tid "+user.getUserId());
        System.out.println("\tname "+user.getUserName());
        System.out.println("\tsalary "+user.getUserSalary());
    }
}
