package com.example.securityspring.Repository;

import com.example.securityspring.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUsernameOrEmail(String usernameOrEmail, String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
