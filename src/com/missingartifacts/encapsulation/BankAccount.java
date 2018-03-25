package com.missingartifacts.encapsulation;

public class BankAccount {
    private double accountBalance;
    private String accountName;
    private long accountNumber;

    public BankAccount(String accountName, long accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        this.accountBalance += amount;
    }

    public void withdraw(double amount){
        this.accountBalance -= amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountBalance=" + accountBalance +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
