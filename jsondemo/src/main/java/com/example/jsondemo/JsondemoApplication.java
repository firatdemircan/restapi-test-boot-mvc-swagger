package com.example.jsondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com/example/jsondemo/Entities")
public class JsondemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JsondemoApplication.class, args);
    }

}
