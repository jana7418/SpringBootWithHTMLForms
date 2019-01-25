package com.tech4bros.models;

import java.util.HashMap;

public class Account {

	String username;
	String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public HashMap<String, String> getMap(){
		HashMap<String, String> map = new HashMap<>();
		map.put("TypedUsername", username);
		map.put("TypedPassword", password);
		return map;
	}
}
