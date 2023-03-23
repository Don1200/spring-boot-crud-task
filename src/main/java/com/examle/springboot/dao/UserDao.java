package com.examle.springboot.dao;

import com.examle.springboot.model.User;

import java.util.List;


public interface UserDao {


    void addUser (User user);
    void editUser (User user);
    void deleteUser(User user);
    List<User> getAllUsers();
    public User getUserById (Long id);
}
