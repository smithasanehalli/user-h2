package com.example.demo.service;

import com.example.demo.exceptions.UserServiceException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    Utils utils;

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }


    @Override
    public User createUser(User user) {
        User result = userRepository.save(user);
        return result;
    }

    @Override
    public User findById(long userId) {
        User result = userRepository.findById(userId).orElseThrow(() -> new UserServiceException("User not found for this id :: " + userId));
        return result;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> result = userRepository.findAll();
        return result;
    }

    @Override
    public User updateUser(long userId, User userDetails) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserServiceException("User not found for this id :: " + userId));

        user.setEmail(userDetails.getEmail());
        user.setLastName(userDetails.getLastName());
        user.setFirstName(userDetails.getFirstName());
        final User updatedUser = userRepository.save(user);
        return updatedUser;
    }

    @Override
    public void deleteUser(long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserServiceException("User not found for this id :: " + userId));
        userRepository.delete(user);

    }
}
