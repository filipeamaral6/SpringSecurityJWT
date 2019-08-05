package com.polarising.bootsecurity.model;


public class User {
	
	private long id;
	
	private String username;

	private String password;
	
	private int active;
	
	private String role;
	

	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.active = 1;
		this.role = role;
	}
	
	protected User(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}