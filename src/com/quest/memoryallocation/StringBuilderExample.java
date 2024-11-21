package com.quest.memoryallocation;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append
        sb.append("Hello World");
        System.out.println("Append : "+sb);
        //replace
        sb.replace(0,5,"Hi");
        System.out.println("Replace Hello to Hi : "+sb);
        //delete
        sb.delete(0,2);
        System.out.println("Deleting hi : "+sb);
        //insert
        sb.insert(6," Hello");
        System.out.println("Inserting hello to start : "+sb);
        //reverse
        sb.reverse();
        System.out.println("Reverse : "+sb);
        //charAt
        char c = sb.charAt(1);
        System.out.println("Char at index 1 : "+c);
    }
}
