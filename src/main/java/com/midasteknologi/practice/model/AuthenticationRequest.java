package com.midasteknologi.practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AuthenticationRequest {

    private String username;
    private String password;
}
