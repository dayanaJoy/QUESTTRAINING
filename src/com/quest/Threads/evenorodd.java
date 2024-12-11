package com.quest.Threads;

public class evenorodd {

    public static void main(String[] args) {
        eventhread even = new eventhread();
        oddthread odd = new oddthread();
        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();

    }
}

class eventhread extends Thread {
    @Override
    public void run() {
        System.out.println("Even numbers : ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class oddthread extends Thread {
    @Override
    public void run() {
        System.out.println("odd numbers : ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

