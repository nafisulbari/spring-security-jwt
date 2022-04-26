package com.midasteknologi.practice.service;

import com.midasteknologi.practice.model.Account;
import com.midasteknologi.practice.util.RandomStringUtil;
import com.midasteknologi.practice.model.Authority;
import com.midasteknologi.practice.model.User;
import com.midasteknologi.practice.repository.AuthorityRepository;
import com.midasteknologi.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthorityRepository authorityRepository;

    public Account createRandomUser() {

        User user = new User();
        user.setUserName(RandomStringUtil.generateRandomString(3));
        user.setPassword(RandomStringUtil.generateRandomString(3));
        userRepository.save(user);

        Authority authority = new Authority();
        authority.setRole("ROLE_ADMIN");
        authority.setUser(user);
        authorityRepository.save(authority);

        return Account.builder(user.getUserName(), user.getPassword())
                .authority(authority.getRole())
                .instructions("Please make a post request at 'localhost/authenticate' with 'username' and 'password' " +
                        "as keys inorder to access the authenticated page 'localhost/admin'")
                .build();
    }
}
