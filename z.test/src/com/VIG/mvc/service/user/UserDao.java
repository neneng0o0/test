package com.VIG.mvc.service.user;

import java.util.List;

import com.VIG.mvc.service.domain.User;

public interface UserDao {
	
	// INSERT
	public void addUser(User user) throws Exception;

	// SELECT ONE
	public User getUser(int userCode) throws Exception;	

	// UPDATE 
	public void updateUser(User user) throws Exception;	
	
	// delete 
	public void deleteUser(User userCode) throws Exception;


	public List<User> getUserList(User user) throws Exception;
	
	gg
		
	

	
}
