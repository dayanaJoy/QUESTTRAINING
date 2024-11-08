package com.quest.practice_Vars;

public class PracticeOPerators {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        //arithemetic operator
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a-b);
        System.out.println(a/b);

        //relational operator
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);

        //logical operator
        Boolean x = true;
        Boolean y= false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(x!=y);

        int z=10;//assignment operator
        z+=5;
        //unary operator
        System.out.println(z);
        System.out.println(z++);
        System.out.println(++z);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=5;
        int result = p>15 ? q++ : 0;
        System.out.println(result);
    }
}
