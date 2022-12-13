package com.crm.core.api;

import com.crm.core.model.Order;
import com.crm.core.model.User;
import com.crm.core.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserServiceInterface service;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<User>> list() {
        List<User> users = service.getAll();
        return (users == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(users);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<User> getById (@PathVariable("id") int id) throws Exception {
        User user = service.getById(id);
        return (user == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        User createdUser = service.createUser(user);
        return (createdUser == null) ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(createdUser);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.deleteUser(id);
    }
}
