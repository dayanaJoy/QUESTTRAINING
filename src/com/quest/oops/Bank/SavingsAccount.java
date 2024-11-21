package com.quest.oops.Bank;
public class SavingsAccount extends BankAccount {
    private final double MIN_BALANCE = 500.0;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);

    }


    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings");
        System.out.println("Minimum Balance: " +MIN_BALANCE);
    }
}
