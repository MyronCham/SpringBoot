package com.nari.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nari.pojo.Users;

/**
 * SpringBoot 整合Freemarker:
 */
@Controller
public class UserController {
	/*
	 * 处理请求，产生数据
	 */
	@RequestMapping("/showUser")
	public String showUser(Model model){
		List<Users> list = new ArrayList<>();
		list.add(new Users(1, "张三", 20));
		list.add(new Users(2, "李四", 21));
		list.add(new Users(3, "王五", 23));
		//需要一个model对象
		model.addAttribute("list",list);
		//跳转视图
		return "user";
	}
}
