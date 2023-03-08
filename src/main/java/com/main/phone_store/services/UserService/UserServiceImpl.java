package com.main.phone_store.services.UserService;

import com.main.phone_store.entities.User;
import com.main.phone_store.repositories.UserRepository;
import com.main.phone_store.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    // Save user
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    // Read user list.
    @Override
    public List<User> fetchUserList() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserByID(int user_id) {
        return userRepository.findById(user_id);
    }

    // Update user
    @Override
    public User updateUser(User user, int user_id) {
        User cusDB = userRepository.findById(user_id).get();
        if (Objects.nonNull(user.getUserID())){
            cusDB.setUserID(user.getUserID());
        }
        if  (Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())){
            cusDB.setUserName(user.getUserName());
        }
        if (Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())){
            cusDB.setName(user.getName());
        }
        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())){
            cusDB.setEmail(user.getEmail());
        }
        if (Objects.nonNull(user.getPhone())){
            cusDB.setPhone(user.getPhone());
        }
        if(Objects.nonNull(user.getPassword())){
            cusDB.setPassword(user.getPassword());
        }
        if (Objects.nonNull(user.getAddress())){
            cusDB.setAddress(user.getAddress());
        }
        if (Objects.nonNull(user.isAccessLevel())){
            cusDB.setAccessLevel(user.isAccessLevel());
        }
        return saveUser(cusDB);
    }

    @Override
    public void deleteUser(int user_id) {
        userRepository.deleteById(user_id);
    }
}
