package com.chatApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatApp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
