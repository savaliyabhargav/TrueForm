package com.example.UserService.services;


import com.example.UserService.UserRepository;
import com.example.UserService.dto.RegisterRequest;
import com.example.UserService.dto.UserResponce;
import com.example.UserService.models.User;
import lombok.AllArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServices {

    private final UserRepository repository;
    public  UserResponce register(RegisterRequest request) {
        if(repository.existsbyEmail(request.getEmail())){

        }
        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassward(request.getPassword());

        User savedUser = new User();
        UserResponce userResponce = new UserResponce();
        userResponce.setId(savedUser.getId());
        userResponce.setPassward(savedUser.getPassward());
        userResponce.setEmail(savedUser.getEmail());
        UserResponce.getFirstName(savedUser.getFirstName());
        userResponce.getLastName(savedUser.getLastName());
        userResponce.getCreatedAt(savedUser.getCreatedAt());
        userResponce.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponce;


    }
}
