package com.quest.practice_vars;

public class controlFlow {
    public static void main(String[] args) {
        int number = 10;
        if (number < 10) {
            System.out.println("number is a negative number" + number);
        } else if (number == 0) {
            System.out.println("number is zero" + number);
        } else {
            System.out.println("number is a positive number" + number);
        }

        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        TestForloop();
    }
    static void TestForloop()
    {
        for (int i = 0; i < 21; i++)
        {
            if(i%2!=0)
            {
               continue;
            }
               System.out.println("Even number"+i);
                continue;
            //System.out.println(i);
        }
    }
    static void Whileloop()
    {
        int i = 0;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
    }
}
