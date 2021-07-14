package com.java.jwt.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.jwt.api.entity.User;


public interface UserRepositry extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
