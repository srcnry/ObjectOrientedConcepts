package com.missingartifacts.encapsulation;

public class BankAccountTest {
    public static void main(String args[]){
        BankAccount bankAccount = new BankAccount("main account", 12345);
        System.out.println(bankAccount.toString());

        /* bank account balance cannot be accessed via field referencing
         * balance can modified by using publicly accessible methods
         * deposit and withdraw...
         */
        bankAccount.deposit(1000);
        bankAccount.deposit(790);
        System.out.println(bankAccount.toString());

        bankAccount.withdraw(540);
        System.out.println(bankAccount.toString());

    }
}
