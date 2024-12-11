package com.quest.Threads.Synchronization;

import java.util.ArrayList;

class Producer implements Runnable {
    private ArrayList<String> buffer;
    private int maxSize;

    public Producer(ArrayList<String> buffer) {
        this.buffer = buffer;
        this.maxSize = 5;
    }

    @Override
    public void run() {
        int itemNumber = 1;
        while (true) {
            try {
                synchronized (buffer) {
                    if (buffer.size() == maxSize) {
                        System.out.println("Buffer is full");
                        buffer.wait();
                    } else {
                        String item = "Item" + itemNumber;
                        buffer.add(item);
                        System.out.println("Producer produced: " + item);
                        itemNumber++;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private ArrayList<String> buffer;

    public Consumer(ArrayList<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (buffer) {
                    if (buffer.isEmpty()) {
                        System.out.println("Buffer is empty");
                        buffer.wait();
                    } else {
                        String item = buffer.remove(0);
                        System.out.println("Consumer consumed: " + item);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        ArrayList<String> buffer = new ArrayList<>();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}