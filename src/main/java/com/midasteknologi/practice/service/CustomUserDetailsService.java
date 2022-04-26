package com.midasteknologi.practice.service;

import com.midasteknologi.practice.model.Authority;
import com.midasteknologi.practice.model.CustomUserDetails;
import com.midasteknologi.practice.model.User;
import com.midasteknologi.practice.repository.AuthorityRepository;
import com.midasteknologi.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthorityRepository authorityRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.getUserByUserName(username);
        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        Set<Authority> authorities = authorityRepository.getAuthoritiesByUser(optionalUser.get());

        return new CustomUserDetails(optionalUser.get(), authorities);
    }
}
