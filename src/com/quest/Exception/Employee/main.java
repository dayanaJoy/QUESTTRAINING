package com.quest.Exception.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        Manager manager = null;

        while (employee == null) {
            try {
                System.out.println("Enter Employee details:");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                employee = new Employee(name, age, salary);
                System.out.println("Employee created successfully!");
                employee.displayDetails();
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException : " + e.getMessage() + "\tPlease re-enter details.");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException : " + e.getMessage() + "\tPlease re-enter details.");
                sc.nextLine();
            }
        }

        while (manager == null) {
            try {
                System.out.println("Enter Manager details:");
                System.out.print("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                System.out.print("Team Size: ");
                int teamSize = sc.nextInt();
                manager = new Manager(name, age, salary, teamSize);
                System.out.println("Manager created successfully!");
                System.out.println(manager);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException " + e.getMessage() + "\tPlease re-enter details.");
                //sc.nextLine();
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException " + e.getMessage() + "\tPlease re-enter details.");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException : " + e.getMessage() + "\tPlease re-enter details.");
                //sc.nextLine();
            }
        }
        sc.close();
        System.out.println("\nFinal output\n");
        System.out.println("Employee Details : "+employee);
        System.out.println("Manager Details : "+manager);
    }
}
