package com.pb.malkova.hw13;

import java.util.ArrayList;
import java.util.Random;

public class Consumer implements Runnable {
    Random random = new Random();
    final int maxDelay;
    final ArrayList<Integer> list;

    public Consumer(ArrayList<Integer> list, int maxDelay) {
        this.list = list;
        this.maxDelay = maxDelay;
    }

    public void consume() {
        synchronized (list) {
            while (list.isEmpty()) {
                System.out.println("The list is empty, consumption is not possible");
                try {
                    System.out.println("The consumer wait");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer firstElement = list.get(0);
            System.out.println("Consumed: " + firstElement);
            list.remove(firstElement);
            System.out.println("Full list: " + list);
            list.notifyAll();
        }
    }

    @Override
    public void run() {
        System.out.println("The consumer started working");
        while (true) {
            consume();
            try {
                int delay = random.nextInt(maxDelay);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
