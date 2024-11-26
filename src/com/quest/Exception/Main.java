package com.quest.Exception;

public class Main {
    public static void main(String[] args) {
        Checked checked = new Checked();
        try {
            checked.validateAge(16);
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        Unchecked unchecked = new Unchecked();

        unchecked.divide(10,0);
        unchecked.age();
    }
}
