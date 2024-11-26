package com.quest.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void Example()  {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        try {
            System.out.print("Enter the first number: ");
            number1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            number2 = sc.nextInt();
            int result = number1 / number2;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero ");
        } catch (InputMismatchException e) {
            System.out.println("Enter valid numbers ");
        } catch(NullPointerException e){
                System.out.println("Null value ");
            }

        try {
            int[] array = new int[5];
            System.out.println("Enter array elements : ");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            System.out.print("Enter an index (0 to 4) : ");
            int index = sc.nextInt();
            System.out.println("Array element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Exception handling is complete.");
        }
    }

    public static void main(String[] args) {
        ExceptionExample exceptionexample = new ExceptionExample();
        exceptionexample.Example();
    }
}



