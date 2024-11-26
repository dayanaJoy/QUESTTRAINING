package com.quest.Exception;

import java.util.ArrayList;

public class StackError {
    public static void causeStackOverflow() {
        causeStackOverflow();
    }

    public static void causeOutOfMemory() {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<Integer.MAX_VALUE;i++){
            List.add(i);
        }
    }

    public static void main(String[] args) {

        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e);
        }

        try {
            causeOutOfMemory();
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e);
        }
    }
}


