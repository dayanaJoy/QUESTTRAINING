package com.quest.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args)  {
        try {
            FileInputStream fid = new FileInputStream("file1.txt");
            System.out.println("File is created successfully");
            int c ;
            String str = "Input as streams";
            FileOutputStream fos = new FileOutputStream("file1.txt");
           // fos.write(fid.read());
            while ((c = fid.read()) != -1) {
             System.out.print((char) c);
            }
            fid.close();
            fos.close();
            System.out.println("\nFile stream is closed successfully");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
