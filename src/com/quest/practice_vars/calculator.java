package com.quest.practice_vars;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        double start = sc.nextInt();
        double result = 0;
        char choice2;
        do {
            System.out.println("Current Result: " + start);
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5.Square Root");
            System.out.println("6.Clear current result ");
            System.out.println("7.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number to add: ");
                    double addnumber = sc.nextDouble();
                    result = start + addnumber;
                    break;
                case 2:
                    System.out.println("Enter number to subtract: ");
                    double subnumber = sc.nextDouble();
                    result = start - subnumber;
                    break;
                case 3:
                    System.out.println("Enter number to multiply: ");
                    double multnumber = sc.nextDouble();
                    result = start * multnumber;
                    break;
                case 4:
                    System.out.println("Enter number to divide: ");
                    double divnumber = sc.nextDouble();
                    result = start / divnumber;
                    break;
                case 5:
                    System.out.println("Enter number to square root: ");
                    double sqrrootnumber = sc.nextDouble();
                    result = Math.sqrt(sqrrootnumber);
                    break;
                case 6:
                    System.out.println("clear current result");
                    result = 0;
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Current Result = "+result);
            System.out.println("Do you want to continue (Y/N): ");
            choice2 = sc.next().charAt(0);
        } while (choice2 == 'Y');
        System.out.println("Calculator Exited");
    }
}
