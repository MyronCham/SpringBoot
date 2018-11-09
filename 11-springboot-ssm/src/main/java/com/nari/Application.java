package com.nari;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动类： 
 *
 */
@SpringBootApplication
@MapperScan("com.nari.mapper") //用户扫描mybatis的mapper接口
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
