package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.TimeUnit;

public class WithRedisJavaExample {

    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            stop = true;
            System.out.println("Shutting down gracefully...");
        }));

        JedisPool pool = new JedisPool("localhost", 6379);

        while (!stop) {
            try (Jedis jedis = pool.getResource()) {
                jedis.set("foo", "bar");
                System.out.println(jedis.get("foo"));

                printMemoryUsage();

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
