package com.crm.core.service.impl;

import com.crm.core.model.User;
import com.crm.core.repository.UserRepositoryInterface;
import com.crm.core.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    UserRepositoryInterface repository;

    @Override
    public List<User> getAll() {

        return repository.findAll();
    }

    @Override
    public User getById(Integer id) throws Exception {

        return repository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public User createUser(User user) {

        return repository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {

        repository.deleteById(id);
    }

    @Override
    public User updateUser(User user) throws Exception {

        User userUpd = repository.findById(user.getId()).orElseThrow(Exception::new);

        userUpd.setPassword(user.getPassword());
        userUpd.setMail(user.getMail());
        userUpd.setGrants(user.getGrants());

        return repository.save(userUpd);
    }
}
