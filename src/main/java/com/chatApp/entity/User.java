package com.chatApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private Integer id;
	private String name;
	private String mobile;
	private String bio;
	private String password;
	
}
