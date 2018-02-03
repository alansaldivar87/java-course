package com.tecgurus.login.dao;

import java.util.List;

import com.tecgurus.login.model.User;

public interface UserDAO {
	
	public void insert(User user);
	
	public List<User> getAllUsers();
	
	public User findById(int id);
	
	public User findByEmail(String email);
	
}
