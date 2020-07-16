package com.VIG.mvc.service.user;

import java.util.List;
import java.util.Map;

import com.VIG.mvc.service.domain.User;

public interface UserServices {
	
	// INSERT
	public void addUser(User user) throws Exception;

	// SELECT ONE
	public User getUser(int userCode) throws Exception;	

	// UPDATE 
	public void updateUser(User user) throws Exception;
	
	// delete 
	public void deleteUser(User userCode) throws Exception;

	// 회원정보리스트 
	public Map<String , Object> getUserList(User user) throws Exception;
	
	// 이메일보내기
	public boolean sendEmail(String email) throws Exception;
	
	// 아이디중복체크
	public boolean checkDuplication(String userCode) throws Exception;

	
}
