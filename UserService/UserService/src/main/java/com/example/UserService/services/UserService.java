package com.example.UserService.services;


import com.example.UserService.UserRepository;
import com.example.UserService.dto.RegisterRequest;
import com.example.UserService.dto.UserResponse;
import com.example.UserService.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;
    public UserResponse register(RegisterRequest request) {
        if(repository.existsbyEmail(request.getEmail())){
                throw new RuntimeException("Email already exist");
        }
        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassward(request.getPassword());

        User savedUser = new User();
        UserResponse userResponce = new UserResponse();
        userResponce.setId(savedUser.getId());
        userResponce.setPassward(savedUser.getPassward());
        userResponce.setEmail(savedUser.getEmail());
        UserResponse.getFirstName(savedUser.getFirstName());
        userResponce.getLastName(savedUser.getLastName());
        userResponce.getCreatedAt(savedUser.getCreatedAt());
        userResponce.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponce;


    }
}
