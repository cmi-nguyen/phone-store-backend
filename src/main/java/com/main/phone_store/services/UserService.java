package com.main.phone_store.services;

import com.main.phone_store.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
    // save user operation.
    User saveUser(User user);

    // Read user list operation
    List<User> fetchUserList();

    // Read user by Id
    Optional<User> getUserByID(int user_id);
    // Update user operation
    User updateUser(User user, int user_id);

    // Delete user operation
    void deleteUser( int user_id);
}
