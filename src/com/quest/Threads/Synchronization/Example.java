package com.quest.Threads.Synchronization;

/*
public class Example implements Runnable{
    private String msg;

    public Example(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" is started"+System.currentTimeMillis());

        try{
            Thread.sleep(1000);
            synchronized (msg){
               // msg.
                //msg.setMsg(name+" Notifies work done");
                msg.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/

class Table {
    // Synchronized method to print the table
    synchronized void printTable(int n) {
        for(int i = 1; i <= 5; i++) {
            // Print the multiplication result
            System.out.println(n * i);
            try {
                // Pause execution for 400 milliseconds
                Thread.sleep(400);
            } catch(Exception e) {
                // Handle any exceptions
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread {
    Table t;
    // Constructor to initialize Table object
    MyThread1(Table t) {
        this.t = t;
    }
    // Run method to execute thread
    public void run() {
        // Call synchronized method printTable with argument 5
        t.printTable(5);
    }
}
class MyThread2 extends Thread {
    Table t;
    // Constructor to initialize Table object
    MyThread2(Table t) {
        this.t = t;
    }
    // Run method to execute thread
    public void run() {
        // Call synchronized method printTable with argument 100
        t.printTable(100);
    }
}
public class Example {
    public static void main(String args[]) {
        // Create a Table object
        Table obj = new Table();
        // Create MyThread1 and MyThread2 objects with the same Table object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        // Start both threads
        t1.start();
        t2.start();
    }
}
