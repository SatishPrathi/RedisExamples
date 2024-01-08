package org.example;

import java.util.concurrent.TimeUnit;

public class JavaWithoutRedisExample {

    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            stop = true;
            System.out.println("Shutting down gracefully...");
        }));

        while (!stop) {
            System.out.println("Java program without Redis");

            printMemoryUsage();

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printMemoryUsage() {
        long usedMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024);
        System.out.println("Memory Usage: " + usedMemory + " MB");
    }
}
