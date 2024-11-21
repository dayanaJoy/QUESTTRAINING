package com.quest.oops.Bank;

public class Withdraw extends Transaction {
    private double amount;
    public Withdraw(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public void processTransaction() {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn Amount : " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
