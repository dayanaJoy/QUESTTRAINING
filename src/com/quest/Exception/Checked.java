package com.quest.Exception;

public class Checked {
    public void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}








