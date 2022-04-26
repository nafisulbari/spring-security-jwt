package com.midasteknologi.practice.repository;

import com.midasteknologi.practice.model.Authority;
import com.midasteknologi.practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

    Set<Authority> getAuthoritiesByUser(User user);
}
