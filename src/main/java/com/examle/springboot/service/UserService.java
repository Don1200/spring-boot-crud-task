package com.examle.springboot.service;

import com.examle.springboot.model.User;

import java.util.List;

public interface UserService {


    void addUser (User user);
    void editUser (User user);
    void deleteUser(User user);
    List<User> getAllUsers();
     User getUserById (Long id);

}
