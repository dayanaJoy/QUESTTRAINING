package com.quest.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Myrunnable rn1 = new Myrunnable();
        Myrunnable rn2 = new Myrunnable();
        Myrunnable rn3 = new Myrunnable();

        Thread thread1 = new Thread(rn1,"Hello");
        Thread thread2 = new Thread(rn2,"world");
        Thread thread3 = new Thread(rn3,"!");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }

    
}
