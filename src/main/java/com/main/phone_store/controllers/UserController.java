package com.main.phone_store.controllers;

import com.main.phone_store.entities.User;
import com.main.phone_store.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    // Save user
    @PostMapping("/user")
    public  User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    // Read user list mapping
    @GetMapping("/user")
    public List<User> fetchUserList(){
        return userService.fetchUserList();
    }
    
    // Read user by id.

    @GetMapping("/user/{id}")
    public Optional<User> getUserByID( @PathVariable("id") int id){
        return userService.getUserByID(id);
    }

    // Update user by id
    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody  User user, @PathVariable("id") int user_id){
        return userService.updateUser(user,user_id);
    }
    // Delete user
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") int user_id){
        userService.deleteUser(user_id);
    }
}
