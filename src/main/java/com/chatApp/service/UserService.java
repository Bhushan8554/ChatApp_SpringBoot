package com.chatApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatApp.repository.UserRepository;

@Service
public interface UserService {

	@Autowired
	UserRepository userRepository;
}
