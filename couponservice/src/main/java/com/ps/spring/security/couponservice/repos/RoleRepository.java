package com.ps.spring.security.couponservice.repos;

import com.ps.spring.security.couponservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
