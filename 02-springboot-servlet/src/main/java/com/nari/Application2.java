package com.nari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.nari.servlet.SecondServlet;

/**
 * SpringBoot整合servlet方式二：
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application2 {
	public static void main(String[] args) {
		SpringApplication.run(Application2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		bean.addUrlMappings("/second");
		return bean;
	}
}
