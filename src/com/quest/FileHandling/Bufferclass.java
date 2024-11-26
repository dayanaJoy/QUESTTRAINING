package com.quest.FileHandling;

import java.io.*;

public class Bufferclass {
    public static void main(String[] args) {
        String str = "Hello World";
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file1.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file2.txt"));
            byte[] buffer = new byte[1024];
            int c;
            while ((c = bis.read(buffer)) != -1){
               // System.out.println((char)c);
                bos.write(buffer,0,c);
                System.out.println((char)c);
            }
            bis.close();
            bos.close();
        } catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
