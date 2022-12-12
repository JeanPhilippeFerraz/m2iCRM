package com.crm.core.service;

import com.crm.core.model.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> getAll();
    public User getId(Integer id);
    public User createUser(User user);
    public void deleteUser(User user);
    public User updateUser(User user);

}
