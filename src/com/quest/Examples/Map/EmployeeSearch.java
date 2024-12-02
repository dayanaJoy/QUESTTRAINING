package com.quest.Examples.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        Map<Integer,String> employees = new HashMap<>();
        employees.put(1,"John");
        employees.put(2,"Jane");
        employees.put(3,"Bob");
        employees.put(4,"Mary");
        employees.put(5,"Doe");
        //System.out.println(employees);
        employees.forEach((k,v)->{System.out.println(k+ "->" +v);});
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID : ");
        int id = sc.nextInt();
        System.out.println("Employee name : ");
        for(Map.Entry<Integer,String> emp : employees.entrySet()){
            if(emp.getKey()==id){
                System.out.println(emp.getValue());
            }
        }
    }
}
