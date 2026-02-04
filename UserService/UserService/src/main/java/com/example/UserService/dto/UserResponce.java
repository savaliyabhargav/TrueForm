package com.example.UserService.dto;


import com.example.UserService.models.UserRole;

import lombok.Data;
;

import java.time.LocalDateTime;
@Data
public class  UserResponce {
    private String id;
    private String email;
    private String passward ;
    private String firstName;
    private String lastName;
    private UserRole role = UserRole.USER;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
