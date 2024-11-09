package com.quest.practice_Vars;

import java.util.Scanner;

class Employee
{
    String name;
    double baseSalary;
    double[] monthlySalary = new double[12];

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double TotalSalary()
    {
        double total = 0;
        for (int i=0; i<12; i++)
        {
            total += monthlySalary[i];
        }
        return total;
    }

    public double AverageMonthlySalary()
    {
        return TotalSalary() / 12;
    }

    private double Bonus()
    {
        return baseSalary * 0.1;  // Assuming bonus is 10% of base salary
    }

    public void displayReport()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Monthly Salary Breakdown:");
        for (int i = 0; i < 12; i++)
        {
            System.out.println("  Month " + (i+1) + ": " + monthlySalary[i]);
        }
        System.out.println("Total Salary for the Year: " + TotalSalary());
        System.out.println("Average Monthly Salary: " + AverageMonthlySalary());
        System.out.println("Bonus: " + Bonus());
        System.out.println();
    }
}

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        Employee[] employees = new Employee[numEmployees];
        double totalAverageSalary = 0;
        for (int i = 0; i < numEmployees; i++)
        {
            System.out.print("Enter the name of employee " + (i+1) + ": ");
            String name = sc.next();
            System.out.print("Enter the base salary for " + name + ": ");
            double baseSalary = sc.nextDouble();

            employees[i] = new Employee(name,baseSalary);

            for (int j = 0; j < 12; j++)
            {
                System.out.print("Enter salary for month " + (j+1) + " (0-100000): ");
                double monthlySalary = sc.nextDouble();

                while (monthlySalary < 0 || monthlySalary > 100000)
                {
                    System.out.println("Invalid salary amount. Please enter a value between 0 and 100000.");
                    monthlySalary = sc.nextDouble();
                }
                employees[i].monthlySalary[j] = monthlySalary;
            }

            totalAverageSalary += employees[i].AverageMonthlySalary();
        }
        System.out.println("\n--- Employee Salary Report ---");
        for (int i = 0; i < numEmployees; i++) {
            employees[i].displayReport();
        }

        System.out.println("Average Salary for All Employees: " + (totalAverageSalary / numEmployees));
        System.out.println("Thank you for using the Employee Salary Management System.");
    }
}