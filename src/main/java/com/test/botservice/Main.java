package com.test.botservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Rohit on 6/16/2016.
 */
@SpringBootApplication
public class Main {

    public static ObjectMapper mapper;

    public static void main(String[] args) {
        System.out.println("Running bot rest service");
        mapper = new ObjectMapper();
        SpringApplication.run(Main.class, args);
    }
}
