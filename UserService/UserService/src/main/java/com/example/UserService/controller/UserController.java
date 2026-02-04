package com.example.UserService.controller;

import com.example.UserService.dto.RegisterRequest;
import com.example.UserService.dto.UserResponce;
import com.example.UserService.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private UserServices userServices;
    @PostMapping("/register")
    public ResponseEntity<UserResponce> register(@RequestBody RegisterRequest request ){
        return ResponseEntity.ok(userServices.register(request));
    }
}
