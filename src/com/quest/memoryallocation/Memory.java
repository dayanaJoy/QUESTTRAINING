package com.quest.memoryallocation;

public class Memory {
    public static void main(String[] args) {
        String s1 = "Hello";    //String literals
        String s2 = "Hello world";    //String literals
        String s3 = new String("Hello");//s3 refernce in stack , the value will store in heap
        String s4 = new String("Hello world");//same value heap point to same value.one copy is stored.

        String s5 = s4;
       // System.out.println("Result = "+s1.equals(s2));
//        System.out.println("s3 : "+s3.hashCode());
//        System.out.println("s4 : "+s4.hashCode());
       // check(s3,s4);
        check3(s1,s2);
//        int i1 = 1;
//        int i2 = 1;
//        check2(i1,i2);
    }
    public static void check(String s1, String s2){
        if(s1==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(s1.contains(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void check2(int i1,int i2){
        if(i1==i2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(String.valueOf(i1).equals(i2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void check3(String s1, String s2){
        if(s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if(s2.contains(s1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
