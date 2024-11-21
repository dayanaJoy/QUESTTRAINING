package com.quest.oops.Bank;

public class CurrentAccount extends BankAccount{
    private final double OVERDRAFT_LIMIT = 10000.0;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }



    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Current");
        System.out.println("Overdraft limit: " +OVERDRAFT_LIMIT);
    }
}
