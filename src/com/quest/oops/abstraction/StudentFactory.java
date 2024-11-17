package com.quest.oops.abstraction;


public class StudentFactory
{
    public static Studentss getStudent(String studentType)
    {
        if(studentType.equalsIgnoreCase("online"))
        {
            Studentss onlineStudent=new OnlineStudent();
            return onlineStudent;
        }
        else if(studentType.equalsIgnoreCase("offline"))
        {
            Studentss offlineStudent=new OfflineStudent();
            return offlineStudent;
        }
        else if(studentType.equalsIgnoreCase("regular"))
        {
            Studentss regularStudent=new RegularStudent();
            return regularStudent;
        }
        else
            return null;
    }
}