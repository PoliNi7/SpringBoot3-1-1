package com.mentor.springboot311.dao;

import com.mentor.springboot311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    User getUser(long id);
    void addUser(User user);
    void updateUser(User newUser);
    void deleteUser(long id);
}
