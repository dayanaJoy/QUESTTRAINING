package com.quest.oops.Bank;
import java.util.Scanner;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        BankAccount currentaccount = null;
        BankAccount savingsaccount = null;
        boolean b = false;
        while (!b) {
            System.out.println("\n1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Savings Account Details");
            System.out.println("6. View Current Account Details");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                 case 1:
                    System.out.print("Enter account number: ");
                    int SaccountNumber = sc.nextInt();
                    System.out.print("Enter account holder name: ");
                    String SaccountHolderName = sc.next();
                    System.out.print("Enter initial balance: ");
                    double Sbalance = sc.nextDouble();
                    account = new BankAccount(SaccountNumber, SaccountHolderName, Sbalance);
                    System.out.println("Savings Account created .");
                    savingsaccount = new SavingsAccount(SaccountNumber, SaccountHolderName, Sbalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int CaccountNumber = sc.nextInt();
                    System.out.print("Enter account holder name: ");
                    String CaccountHolderName = sc.next();
                    System.out.print("Enter initial balance: ");
                    double Cbalance = sc.nextDouble();
                    account = new BankAccount(CaccountNumber,CaccountHolderName,Cbalance);
                    System.out.println("Current Account created .");
                    currentaccount = new CurrentAccount(CaccountNumber,CaccountHolderName,Cbalance);
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        Deposit deposit = new Deposit(account, depositAmount);
                        deposit.processTransaction();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        Withdraw withdraw = new Withdraw(account, withdrawAmount);
                        withdraw.processTransaction();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    if (savingsaccount != null) {
                        savingsaccount.displayAccountDetails();

                    }
                    else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 6:
                    if(currentaccount != null) {
                        currentaccount.displayAccountDetails();
                    }
                    else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 7:
                    System.out.println("Exit");
                    sc.close();
                    b = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


