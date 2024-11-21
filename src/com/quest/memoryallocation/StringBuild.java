package com.quest.memoryallocation;

public class StringBuild {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("hello");
        check(s1, s2);//check(s1.totring(),s2.toString()); if we use string instead of stringbuilder in method parameter.
        String s3 = "hello";
    }
    public static void check(StringBuilder s1, StringBuilder s2) {
        if (s1 == s2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
