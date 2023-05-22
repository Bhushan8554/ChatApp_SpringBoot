package com.chatApp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private Integer id;
	private String name;
	private String mobile;
	private String bio;
	private String password;
	
	private List<UserDTO> friends=new ArrayList<>();
	private List<UserDTO> friendReq=new ArrayList<>();
	
}
