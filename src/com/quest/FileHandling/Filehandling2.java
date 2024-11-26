package com.quest.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling2 {
    public static void main(String[] args)  {
        try {
            FileWriter fw = new FileWriter("filewriter1.txt");
            fw.write("Hello World (File Writer example) ");
            fw.append('a');
            fw.append("@charseqindextry",0,16);
//            CharSequence charsq = new CharSequence() {
//                @Override
//                public int length() {
//                    return 0;
//                }
//
//                @Override
//                public char charAt(int index) {
//                    return 0;
//                }
//
//                @Override
//                public CharSequence subSequence(int start, int end) {
//                    return null;
//                }
//
//                @Override
//                public String toString() {
//                    return "file created using char sequence";
//                }
//            };
            //fw.append(charsq);
            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//if (file.exists()) {
//        // System.out.println("File exists  "+file.getName());
//        //System.out.println("File exists  "+file.getAbsoluteFile());
//        System.out.println("File exists  "+file.getPath());
//        } else {
//        System.out.println("File not exists");
//        }
