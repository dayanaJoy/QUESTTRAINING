package com.quest.practice_vars;

public class CharCount {

    public static void main(String[] args) {
        String s = "Dayana";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

        System.out.println("Character counts:");
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ' && currentChar != '0') {
                int count = 0;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println(currentChar + ": " + count);
                    s = s.replace(currentChar, '0');
                }
            }
        }
    }
}

