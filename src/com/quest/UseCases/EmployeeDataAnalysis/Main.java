package com.quest.UseCases.EmployeeDataAnalysis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 60000),
                new Employee(2, "Bob", "Finance", 40000),
                new Employee(3, "Charlie", "HR", 55000),
                new Employee(4, "David", "IT", 70000)
        );

        // Group employees by department and print the result
        Map<String, List<String>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Grouped by Department: " + groupedByDepartment);

        // Filter employees with a salary greater than 50,000, sort them by name, and print their details
        List<Employee> filteredAndSorted = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("Employees with salary > 50000: "
                + filteredAndSorted.stream()
                .map(Employee::getName)
                .collect(Collectors.toList()));

        // Find the employee with the highest salary
        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow();

        System.out.println("Employee with highest salary: " + highestPaidEmployee.getName());
    }
}


