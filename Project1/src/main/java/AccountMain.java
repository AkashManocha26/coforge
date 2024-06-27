public class AccountMain {
    public static void main(String[] args) {
//        Account account=new Account(1001,"Ankit Kumar",10000,0.5f);
//        System.out.println("Account Data");
//        System.out.println("\tid "+account.getActId());
//        System.out.println("\tname "+account.getActName());
//        System.out.println("\trate "+account.getRate());
//        System.out.println("\tbalance "+account.getBalance());

        SavingAccount sv=new SavingAccount(1001,"Ankit Kumar",10000,0.5f,4,"jaipur");
        System.out.println("Account Data");
        System.out.println("\tid "+sv.getActId());
        System.out.println("\tname "+sv.getActName());
        System.out.println("\trate "+sv.getRate());
        System.out.println("\tbalance "+sv.getBalance());
        System.out.println("\tinterest "+sv.interest());
        System.out.println("\tlocation "+sv.getLocation());
        System.out.println("\ttime "+sv.getTime());

        sv.deposit(3000);
        System.out.println("After deposit balance is "+sv.getBalance());

        sv.withdraw(300);
        System.out.println("After withdraw balance is "+sv.getBalance());


    }
}
