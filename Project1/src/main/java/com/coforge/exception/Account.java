package com.coforge.exception;

public class Account {
    private int accountNo;
    private String accountName;
    private float accountBalance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo)throws AccountException {
        if(accountNo<=0)
            throw new AccountException("Account no. can not be zero or negative");
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName)throws AccountException {
        if(accountName.isBlank())
            throw new AccountException("Account name is blank");
        else if(accountName.length()<5 ||accountName.length()>15 )
            throw new AccountException("Name Length should be greater than 5 and less than 15");
        this.accountName = accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance)throws AccountException {
        if(accountBalance<0)
            throw new AccountException("Account balance can not be negative");
        this.accountBalance = accountBalance;
    }
}
