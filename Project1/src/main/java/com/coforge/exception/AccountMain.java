package com.coforge.exception;

public class AccountMain {
    public static void main(String[] args) {
        try{
        Account account=new Account();

        //account.setAccountNo(0);
        account.setAccountNo(122);
        account.setAccountName("a");
        account.setAccountBalance(-8999);

        System.out.println("Account Information");
        System.out.println("\taccount no "+account.getAccountNo());
        System.out.println("\taccount name "+account.getAccountName());
        System.out.println("\taccount balance "+account.getAccountBalance());
        }
        catch(AccountException e){
            System.err.println(e);
        }
    }
}
