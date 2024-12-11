package com.quest.Threads;

public class Myrunnable implements Runnable {
    @Override
    public void run() {
        //System.out.println("Thread started:::"+Thread.currentThread().getName());
        //System.out.println("Thread Priority:::"+Thread.currentThread().getPriority());

        try {
            Thread.sleep(500);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Thread ended:::" +
        System.out.println(Thread.currentThread().getName());
    }
}
