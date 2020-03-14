package com.example.readdaat.ReadDataFromPropertyFile.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.readdaat.ReadDataFromPropertyFile.model.User;

import ch.qos.logback.classic.Logger;

@RestController
public class UserController {

	@Autowired
	User user;
	
	
	Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

	@GetMapping("/user")
	public String UserDetails() {
		System.out.println(user.getUid()+""+user.getUname());
		return user.toString();
	}
	
	@GetMapping("/logs")
	public String  logs() {
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		return "logs demo";
	}
}
