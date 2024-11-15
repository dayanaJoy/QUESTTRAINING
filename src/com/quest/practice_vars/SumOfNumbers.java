package com.quest.practice_vars;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while(n!=0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("sum of the digits = "+sum);
    }
}
