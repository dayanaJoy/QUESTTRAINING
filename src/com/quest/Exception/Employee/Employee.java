package com.quest.Exception.Employee;

public class Employee {
    private String name;
    private int age;
    private double salary;

    //constructor
    public Employee(String name, int age, double salary) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be at least 18");
        }
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be at least 18");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidInputException {
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative");
        }
    }

    public final void displayDetails() {
        System.out.println("Employee Details : ");
        System.out.println("Name : " + name + " Age : " + age + " Salary : " + salary);

    }


    @Override
    public String toString() {
        return "name= " + name + "\t age=" + age + "\tsalary=" + salary;
    }
}

