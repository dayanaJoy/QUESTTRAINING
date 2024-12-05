package com.quest.Questions;

import java.io.*;
import java.util.Scanner;

public class StringinFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        String searchString = "hello";

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
                FileWriter fw = new FileWriter(file);
                fw.write("Hello World\n");
                fw.close();

                Scanner sc = new Scanner(file);
                System.out.println("Reading file : ");
                boolean found = false;

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);

                    if (line.toLowerCase().contains(searchString.toLowerCase())) {
                        found = true;
                    }
                }
                sc.close();

                if (found) {
                    System.out.println("The string '" + searchString + "' is present in the file.");
                } else {
                    System.out.println("The string '" + searchString + "' is not present in the file.");
                }
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.delete();
        }
    }
}

