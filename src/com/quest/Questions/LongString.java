package com.quest.Questions;

public class LongString {
  /*  public static void main(String[] args) {
        String[] str = {"flower", "flow", "fly"};
        String string = str[0];
        for (int i = 0; i < str.length; i++) {
            int j=0;
                while (j<string.length() && j<str[i].length() && string.charAt(j) == str[i].charAt(j)) {
                    j++;
                }
            string = string.substring(0, j);
            }
        System.out.println(string);
    }
}*/


    public static void main(String[] args) {
        String[] str = {"flower", "flow", "fly"};
        if (str == null || str.length == 0) {
            System.out.println("empty string array.");
            return;
        } else {
            for (int i = 0; i < str[0].length(); i++) {
                char c = str[0].charAt(i);
                for (int j = 1; j < str.length; j++) {
                    if (i >= str[j].length() || c != str[j].charAt(i)) {
                        System.out.println(str[0].substring(0, i));
                        return;
                    }
                }
            }
        }
    }
}

