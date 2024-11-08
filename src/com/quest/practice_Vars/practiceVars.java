package com.quest.practice_Vars;

public class practiceVars {
    final static int VOTE_AGE=18;
    public static void main (String[] args)
    {
        int age=18;
        double salary = 1000.00;
        char gender = 'F';
        String firstname="John";
        String lastname="Doe";

        System.out.println("age = "+age);
        System.out.println("SALARY = "+salary);
        System.out.println("gender = "+gender);
        System.out.println("firstname = "+firstname);
        System.out.println("lastname = "+lastname);

        age=20;
        System.out.println("age = "+age);
        System.out.println("vote age = "+VOTE_AGE);

        practiceConversion();
        stringConcatenation();
        stringMethods();
    }

    private static void practiceConversion()
    {
       int a=20;
       double b=25.5;
       double sum=a+b;
       int round=(int)b;
       System.out.println("sum = "+sum);
       System.out.println("round ="+round);
    }

    private static void stringConcatenation() {
        String s1 = "John";
        String s2 = "Doe";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int age = 20;
        System.out.println("name = " + s3 + ", age = " + age);
    }

    private static void stringMethods()
    {
        String s1 = "John";
        String s2 = "Doe";
        String s4 = new String("hello world");
        String s3 = new String("hello world");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);
    }
}
