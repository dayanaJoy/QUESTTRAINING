package com.quest.oops.Bank;

public class Deposit extends Transaction {
    private double amount;

    public Deposit(BankAccount account,double amount) {
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
        account.setBalance(account.getBalance()+amount);
        System.out.println("Deposited : "+amount);
    }
}
