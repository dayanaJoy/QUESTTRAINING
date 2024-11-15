package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.Scanner;

class Studentsdetails
{
    String name;
    int mathscore;
    int sciencescore;
    int englishscore;
    int totalscore;
    float averagescore;
    char grade;
    String feedback;

    public Studentsdetails(String name, int mathscore, int sciencescore, int englishscore)
    {
        this.name = name;
        this.mathscore = mathscore;
        this.sciencescore = sciencescore;
        this.englishscore = englishscore;
    }
    public int CalculateScore()
    {
        this.totalscore = mathscore + sciencescore + englishscore;
        this.averagescore = (float) totalscore / 3;
        this.grade = CalculateGrade();
        this.feedback = GetFeedback();
        return 0;
    }
    public char CalculateGrade()
    {
       if(averagescore>=90)
           return 'A';
       else if (averagescore>=80)
           return 'B';
       else if(averagescore>=70)
           return 'C';
       else if(averagescore>=60)
           return 'D';
       else
           return 'F';
    }
    public String GetFeedback()
    {
        if(grade=='A')
            return "Excellent Performance";
        else if(grade=='B')
            return "Good job but you can aim higher";
        else if(grade=='C')
            return "You need to put in more effort";
        else if(grade=='D')
            return "Your performance is below expectations.Consider seeking help";
        else
            return "Failure.You need significant improvement";
    }
}
public class Student
{
    static final int MAX_SCORE = 100;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Studentsdetails> Students = new ArrayList<Studentsdetails>();
        System.out.println("Enter the number of the student : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++) {
            System.out.println("Enter the student " + i + " name : ");
            String name = sc.next();
            System.out.println("Enter the student mathscore : ");
            int mathscore = sc.nextInt();
            if(mathscore>MAX_SCORE)
                break;
            System.out.println("Enter the student sciencescore : ");
            int sciencescore = sc.nextInt();
            if(sciencescore>MAX_SCORE)
                break;
            System.out.println("Enter the student englishscore : ");
            int englishscore = sc.nextInt();
            if(englishscore>MAX_SCORE)
                break;
            Studentsdetails student = new Studentsdetails(name, mathscore, sciencescore, englishscore);
            Students.add(student);
            student.CalculateScore();
            System.out.println("Total Score = " + student.totalscore);
            if (student.totalscore < 60) {
                System.out.println("Total Score is less than 60.STOP");
                break;
            }
            System.out.println("Average Score = " + student.averagescore);
            System.out.println("Grade = " + student.grade);
            System.out.println("Feedback = " + student.feedback);
        }
        System.out.println("Summary : " +num);
        System.out.println("Processed");
    }
}