package com.quest.practice_Vars;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit : ");
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("invalid input");
            return;
        }
        int first=0;
        int second=1;
        System.out.println("Fibonacciseries upto"+n+"series : ");
        for(int i=2;i<=n;++i);
        {
            int third=first+second;
            System.out.println(first+" "+second+ " "+third);
            first=second;
            second=third;
        }
    }
}
