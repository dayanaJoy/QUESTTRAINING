package com.quest.practice_vars;

import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        int temp= n;
        while(n!=0)
        {
            int digit = n%10;
            sum=(sum*10)+digit;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
