package com.quest.FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args)  {
        File file = new File("file2.txt");
        try {
            if (file.createNewFile()||file.exists()){
                System.out.println("File created");
                FileWriter fw = new FileWriter(file);
                fw.write("Hello World");
                Scanner sc = new Scanner(String.valueOf(fw));
                System.out.println("Reading file : ");
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
                System.out.println("File is created successfully");
            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.delete();
            System.out.println("File deleted successfully");
        }
    }
}

