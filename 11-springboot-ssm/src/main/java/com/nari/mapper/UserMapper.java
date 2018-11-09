package com.nari.mapper;

import java.util.List;

import com.nari.pojo.Users;

public interface UserMapper {
	void insertUser(Users users);

	List<Users> selectUsersAll();

	Users selectUsersById(Integer id);

	void updateUser(Users users);

	void deleteUserById(Integer id);
}
