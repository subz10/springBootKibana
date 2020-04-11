package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.User;

public interface UserService {
	
	public List<User> getUser();
	public String findById(String id);
	
}
