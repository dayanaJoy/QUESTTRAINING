package com.quest.practice_vars;

import java.util.Scanner;

public class fibonacciseries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);
        for (int i = 1; i < n; i++) {
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
    }
}
