package com.ps.spring.security.couponservice.repos;

import com.ps.spring.security.couponservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
