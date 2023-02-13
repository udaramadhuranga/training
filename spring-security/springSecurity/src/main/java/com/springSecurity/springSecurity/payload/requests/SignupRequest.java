package com.springSecurity.springSecurity.payload.requests;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    private String username;


    private String email;

    private Set<String> roles;


    private String password;
}
