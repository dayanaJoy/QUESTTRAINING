package com.quest.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filestream {
    public static void main(String[] args) {
        try {
            File file = new File("stream.txt");
            if(!file.createNewFile()){
                System.out.println("File created");
            }
            String str = "line1\nline2\nline3\nline4\nline5\n";
            FileOutputStream fos = new FileOutputStream("stream.txt");
            fos.write(str.getBytes());
            fos.write("line6\nline7\nline8\nline9\nline10\n".getBytes());
            fos.close();
            System.out.println("Reading file");
            FileInputStream fis = new FileInputStream(file);
            int data ;
            while((data= fis.read())!=-1){
                System.out.print((char)data);
            }
            fis.close();
            System.out.println("File read successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
