package com.shark.domain;

public class Student {

	private String username;
	private String userId;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", userId=" + userId
				+ ", password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
