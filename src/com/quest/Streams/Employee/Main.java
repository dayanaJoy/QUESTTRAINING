package com.quest.Streams.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 30, "IT", 75000, 5),
                new Employee(2, "Bob", 45, "HR", 50000, 10),
                new Employee(3, "Charlie", 25, "IT", 60000, 3),
                new Employee(4, "David", 35, "Finance", 90000, 8),
                new Employee(5, "john", 40, "Finance", 85000, 12)
        );
        //sorting by salary
        List<Employee> employeesalary = employees.stream()
                .sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()))
                .toList();
        System.out.println("Sorted by Salary");
        employeesalary.forEach(emp->System.out.println(emp));
        System.out.println();
        //filtering by department
        List<Employee> filterbydepartment = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .toList();
        System.out.println("Filtered by Department(IT)");
        filterbydepartment.forEach(emp->System.out.println(emp));
        System.out.println();
        //finding employee with maximum salary
        List<Employee> findbymaxsalary = employees.stream()
                .max((s1,s2) -> (int) (Math.max(s1.getSalary(), s2.getSalary())))
                .stream().toList();
        System.out.println("Finding employee by Salary");
        findbymaxsalary.forEach(emp->System.out.println(emp));
        System.out.println();
        //skip entries
        List<Employee> skipemployee = employees.stream()
                .sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()))
                .skip(2)
                .toList();
        System.out.println("Skipped : ");
        skipemployee.forEach(emp -> System.out.println(emp));
        System.out.println();
        //total or average salary
        Optional<Double> totalsalary = employees.stream().map(Employee::getSalary).reduce((s1, s2) -> s1 + s2);
        System.out.println("Total Salary : "+totalsalary.get());
        System.out.println();
        
    }
}
