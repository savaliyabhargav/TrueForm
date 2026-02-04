package com.example.UserService;

import com.example.UserService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, long> {
    Boolean existsbyEmail(String email);
}
