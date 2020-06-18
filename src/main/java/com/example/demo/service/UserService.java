package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User findById(long userId);

    List<User> getAllUsers();

    User updateUser(long userID, User userDetails);

    void deleteUser(long userID);
}
