package com.example.readdaat.ReadDataFromPropertyFile.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {
	
	@Value("${user.uid}")
	private String uid;
	@Value("${user.uname}")
	private String uname;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}
	
	
	
	
}
