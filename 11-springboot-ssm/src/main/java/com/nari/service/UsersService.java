package com.nari.service;

import java.util.List;

import com.nari.pojo.Users;

public interface UsersService {
	
	
	void addUser(Users users);

	List<Users> findUserAll();

	Users findUserById(Integer id);

	void updataUser(Users users);

	void deleteUserById(Integer id);
}
