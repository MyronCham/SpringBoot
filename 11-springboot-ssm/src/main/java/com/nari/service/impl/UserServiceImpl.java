package com.nari.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nari.mapper.UserMapper;
import com.nari.pojo.Users;
import com.nari.service.UsersService;

@Service
@Transactional
public class UserServiceImpl implements UsersService{

	@Autowired
	private UserMapper userMapper;
	
	//添加用户
	@Override
	public void addUser(Users users) {
		userMapper.insertUser(users);
	}

	//查询所有用户
	@Override
	public List<Users> findUserAll() {
		return userMapper.selectUsersAll();
	}

	//根据id查询用户
	@Override
	public Users findUserById(Integer id) {
		return userMapper.selectUsersById(id);
	}

	//更新用户
	@Override
	public void updataUser(Users users) {
		userMapper.updateUser(users);
	}

	//删除用户
	@Override
	public void deleteUserById(Integer id) {
		userMapper.deleteUserById(id);
	}
	
}
