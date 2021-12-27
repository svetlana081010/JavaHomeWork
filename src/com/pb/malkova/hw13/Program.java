package com.pb.malkova.hw13;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        final int maxListSize = 5;
        final int maxManufacturerDelay = 1000;
        final int maxConsumerDelay = 1000;
        ArrayList<Integer> list = new ArrayList<>();
        Manufacturer manufacturer = new Manufacturer(list, maxManufacturerDelay, maxListSize);
        Consumer consumer = new Consumer(list, maxConsumerDelay);
        Thread manufacturerThread = new Thread(manufacturer);
        Thread consumerThread = new Thread(consumer);

        manufacturerThread.start();
        consumerThread.start();
    }
}
