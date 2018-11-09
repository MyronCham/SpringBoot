package com.nari.pojo;

import org.hibernate.validator.constraints.NotBlank;

public class Users {
	@NotBlank //非空校验
	private String name;
	@NotBlank //密码非空校验
	private String password;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}

