package com.midasteknologi.practice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Builder
public class Account {

    private final String username;
    private final String password;
    @Singular
    private List<String> authorities;
    private String instructions;

    public static AccountBuilder builder(String username, String password) {
        return new AccountBuilder()
                .username(username)
                .password(password);
    }
}
