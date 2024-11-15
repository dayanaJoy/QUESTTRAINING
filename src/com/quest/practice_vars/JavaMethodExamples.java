package com.quest.practice_vars;

public class JavaMethodExamples {
   // private static final int x = 30;
    public static void main(String[] args) {
     JavaMethodExamples javamethodexamples = new JavaMethodExamples();
     javamethodexamples.display("Hello World");
     int result = javamethodexamples.add(1,2);
     System.out.println(result);
     //x=40;
     //System.out.println(x);
    }

    /**
     *
     * @param str
     */
    private void display(String str)  {
        System.out.println(str);
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    private int add(int x, int y) {
        return x + y;
    }


}
