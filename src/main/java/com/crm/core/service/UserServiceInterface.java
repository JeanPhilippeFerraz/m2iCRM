package com.crm.core.service;

import com.crm.core.model.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> getAll();
    public User getById(Integer id) throws Exception;
    public User createUser(User user);
    public void deleteUser(Integer id);
    public User updateUser(User user) throws Exception;

}
