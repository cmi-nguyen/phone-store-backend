package com.main.phone_store.repositories;

import com.main.phone_store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    // userRepository
}
