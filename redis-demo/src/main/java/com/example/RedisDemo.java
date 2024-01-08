package com.example;

import redis.clients.jedis.Jedis;
import java.util.List;

public class RedisDemo {

    public static void main(String[] args) {
        try (Jedis jedis = new Jedis("localhost")) {
            System.out.println("Connected to Redis server");

            List<String> studentList = jedis.lrange("studentList", 0, -1);

            System.out.println("Fetched student details from Redis:");
            for (String studentDetails : studentList) {
                System.out.println(studentDetails);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
