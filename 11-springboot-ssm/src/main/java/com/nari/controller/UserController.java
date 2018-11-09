package com.nari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nari.pojo.Users;
import com.nari.service.UsersService;

@RequestMapping("/users")
@Controller
public class UserController {
	
	@Autowired
	private UsersService userService;
	
	//页面跳转
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	//添加用户
	@RequestMapping("/addUser")
	public String addUser(Users users ) {
		userService.addUser(users);
		return "ok";
	}
	
	//查询全部用户
	@RequestMapping("/findUserAll")
	public String getUser(Model model) {
		List<Users> list = userService.findUserAll();
		model.addAttribute("list", list);
		return "showUsers";
	}
	
	//根据id查询用户，更新用户之前的查询，并将数据在页面中回显
	@RequestMapping("findUserById")
	public String findUserById(Integer id,Model model) {
		Users user = userService.findUserById(id);
		model.addAttribute("user", user);
		return "updateUser";
	}
	
	//更新用户
	@RequestMapping("editUser")
	public String editUser(Users users) {
		userService.updataUser(users);
		return "ok";
	}
	
	//删除用户
	@RequestMapping("delUser")
	public String delUser(Integer id) {
		userService.deleteUserById(id);
		return "redirect:/users/findUserAll";
	}

}
