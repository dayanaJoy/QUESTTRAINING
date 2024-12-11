package com.quest.Threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor implements Runnable {
     String file;

    public FileProcessor(String file) {
        this.file = file;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("start of file: " + file);
            String content;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
            System.out.println("End of file: " + file);
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }


    public static void main(String[] args) {

        String[] files = {"file1.txt", "file2.txt", "file3.txt"};

        for (String file : files) {
            try {
                FileProcessor processor = new FileProcessor(file);
                Thread thread = new Thread(processor);
                thread.start();
            }catch (Exception e) {
                System.out.println("Exception");
            }

        }
    }
}
