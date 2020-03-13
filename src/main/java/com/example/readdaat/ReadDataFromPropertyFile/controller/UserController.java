package com.example.readdaat.ReadDataFromPropertyFile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.readdaat.ReadDataFromPropertyFile.model.User;

@RestController
public class UserController {

	@Autowired
	User user;
	
	@GetMapping("/user")
	public String UserDetails() {
		System.out.println(user.getUid()+""+user.getUname());
		return user.toString();
	}
}
