package com.quest.Threads.Synchronization.Main;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);

        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawal failed due to insufficient balance.");

        }
    }

}

class TransactionRunnable implements Runnable {
    private BankAccount account;
    private int amount;
    private boolean isDeposit;

    public TransactionRunnable(BankAccount account, int amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        TransactionRunnable r1 = new TransactionRunnable(account, 100, true);
        TransactionRunnable r2 = new TransactionRunnable(account, 50, false);
        TransactionRunnable r3 = new TransactionRunnable(account, 2000, false);

        Thread thread1 = new Thread(r1, "Thread 1");
        Thread thread2 = new Thread(r2, "Thread 2");
        Thread thread3 = new Thread(r3, "Thread 3");
        try {
            thread1.start();
            thread1.join();
            System.out.println("Balance : " + account.getBalance());
            thread2.start();
            thread2.join();
            System.out.println("Balance : " + account.getBalance());
            thread3.start();
            thread3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}
