package com.nari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * SpringBoot整合Filter 方式一:
 * @author Administrator
 *
 */
@SpringBootApplication
@ServletComponentScan //在Springboot启动时会扫描@WebFilter，并将该类实例化
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
