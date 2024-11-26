package com.quest.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked implements exp{
    @Override
    public void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithemetic exception : "+e.getMessage());
        }
    }
    @Override
    public void age() {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        try {
            age = sc.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer for age.");
        }
    }
}
