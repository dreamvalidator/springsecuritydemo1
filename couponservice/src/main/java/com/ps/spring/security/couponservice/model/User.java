package com.ps.spring.security.couponservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name="user_id") , inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
