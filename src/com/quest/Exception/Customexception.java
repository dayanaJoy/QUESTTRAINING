package com.quest.Exception;

public class Customexception {
    public static void main(String[] args) {
        String s = null;
       // int i = null;
        try {
            System.out.println("Enter a string : " + s.length());
        }catch (NullPointerException e) {
           // System.out.println("Exception caught : "+e.getLocalizedMessage());
            //System.out.println("Exception caught : "+e.getMessage());
            System.out.println("Exception caught : "+e);
            e.printStackTrace();
        }
    }
}
