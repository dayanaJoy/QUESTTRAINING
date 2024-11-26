package com.quest.FileHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.*;

public class OutputObject {
    public static void main(String[] args) {
        String str = "Added Content";
        try {

//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file3.txt", true));
//            bos.write(str.getBytes());
//            System.out.println("Buffered data is added successfully");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file3.txt"));
            int c;
            while ((c = bis.read()) != -1){
                // System.out.println((char)c);
//                bos.write(buffer,0,c);
                System.out.print((char)c);
            }
            //bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
