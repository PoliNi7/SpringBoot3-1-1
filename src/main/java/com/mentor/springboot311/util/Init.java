package com.mentor.springboot311.util;

import com.mentor.springboot311.model.User;
import com.mentor.springboot311.service.UserService;
import com.mentor.springboot311.service.UserServiceImpl;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Init {
    private final UserService userService;

    public Init(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init(){
        userService.addUser(new User("1", "1", "1"));
    }
}
