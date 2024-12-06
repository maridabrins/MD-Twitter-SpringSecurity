package com.auth.springsecurity.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User,UUID>{

}
