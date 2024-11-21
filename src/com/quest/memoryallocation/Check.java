package com.quest.memoryallocation;

public class Check {
    public static void main(String[] args) {
        String s1 = "hello";
        String s6 = "hello";
        StringBuilder s2 = new StringBuilder("hello");
        StringBuilder s4 = new StringBuilder("hello");
        StringBuffer s3 = new StringBuffer("hello");
        StringBuffer s5 = new StringBuffer("hello");

        System.out.println("equals()");
        System.out.println("String and StringBuilder");
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\nString and StringBuffer");
        if (s1.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\nStringBuilder and StringBuffer");
        if (s2.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\nString and String ");
        if (s1.equals(s6)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\nStringBuilder and StringBuilder");
        if (s2.equals(s4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\nStringBuffer and StringBuffer");
        if (s3.equals(s5)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("\n==");
        System.out.println("StringBuilder");
        if (s2 == s4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("StringBuffer");
        if (s3 == s5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("\nStringBuilder Operations");
        //append
        s2.append(" World");
        System.out.println("Append : "+s2);
        //replace
        s2.replace(0,5,"Hi");
        System.out.println("Replace Hello to Hi : "+s2);
        //delete
        s2.delete(0,2);
        System.out.println("Deleting hi : "+s2);
        //insert
        s2.insert(6," Hello");
        System.out.println("Inserting hello to start : "+s2);
        //reverse
        s2.reverse();
        System.out.println("Reverse : "+s2);
        //charAt
        char c = s2.charAt(1);
        System.out.println("Char at index 1 : "+c);

        System.out.println("\nStringBuffer Operations");
        //append
        s3.append(" World");
        System.out.println("Append : "+s3);
        //replace
        s3.replace(0,5,"Hi");
        System.out.println("Replace Hello to Hi : "+s3);
        //delete
        s3.delete(0,2);
        System.out.println("Deleting hi : "+s3);
        //insert
        s3.insert(6," Hello");
        System.out.println("Inserting hello to start : "+s3);
        //reverse
        s3.reverse();
        System.out.println("Reverse : "+s3);
        //charAt
        c = s2.charAt(1);
        System.out.println("Char at index 1 : "+c);
    }
}
