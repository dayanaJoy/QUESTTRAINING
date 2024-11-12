package com.quest.practice_Vars;
import java.util.Scanner;
class Employee {
    String name;
    double baseSalary;
    double[] monthlySalaries = new double[12];
    double bonus;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void calculateMonthlySalaries() {
        monthlySalaries[0] = baseSalary;  // Month 1 salary is base salary
        bonus = baseSalary * 0.10; // Assuming bonus is 10% of base salary
        for (int i = 1; i < 12; i++) {
            monthlySalaries[i] = baseSalary + bonus;
        }
    }
    // Calculate total annual salary
    public double calculateTotalAnnualSalary() {
        double total = 0;
        for (double monthlySalary : monthlySalaries) {
            total += monthlySalary;
        }
        return total;
    }
    // Calculate average salary
    public double calculateAverageSalary() {
        double total = calculateTotalAnnualSalary();
        return total / 12;
    }
    // Calculate bonus (10% of base salary)
    public double calculateBonus() {
        return this.baseSalary * 0.10;
    }
    // Display report for the employee
    public void displayReport() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Monthly Salary Breakdown:");
        for (int i = 0; i < 12; i++) {
            System.out.println("  Month " + (i + 1) + ": " + monthlySalaries[i]);
        }
        double totalSalary = calculateTotalAnnualSalary();
        double averageSalary = calculateAverageSalary();
        System.out.println("Total Salary for the Year: " + totalSalary);
        System.out.println("Average Monthly Salary: " + averageSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println();
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 0;
        // Get the number of employees and handle invalid input
        while (true) {
            try {
                System.out.print("Enter the number of employees: ");
                numEmployees = Integer.parseInt(scanner.nextLine());
                if (numEmployees <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        Employee[] employees = new Employee[numEmployees];
        // Input employee data
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            double baseSalary = 0;
            while (true) {
                try {
                    System.out.print("Enter the base salary for " + name + ": ");
                    baseSalary = Double.parseDouble(scanner.nextLine());
                    if (baseSalary < 0) {
                        System.out.println("Base salary cannot be negative. Please enter a valid amount.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for base salary.");
                }
            }
            Employee employee = new Employee(name, baseSalary);
            employee.calculateMonthlySalaries(); // Calculate monthly salaries with bonus
            employees[i] = employee;
        }
        // Display reports for all employees
        System.out.println("--- Employee Salary Report ---");
        double totalSalaries = 0;
        for (Employee employee : employees) {
            employee.displayReport();
            totalSalaries += employee.calculateAverageSalary();
        }
        // Calculate and display average salary for all employees
        double averageSalaryForAll = totalSalaries / numEmployees;
        System.out.println("Average Salary for All Employees: " + averageSalaryForAll);
        System.out.println("Thank you for using the Employee Salary Management System.");
        scanner.close();
    }
}
