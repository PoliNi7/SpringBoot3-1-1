package com.mentor.springboot311;

import com.mentor.springboot311.model.User;
import com.mentor.springboot311.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBoot311Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot311Application.class, args);
    }

}