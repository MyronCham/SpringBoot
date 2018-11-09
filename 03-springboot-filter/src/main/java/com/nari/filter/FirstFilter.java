package com.nari.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 	SpringBoot整合Filter 方式一:
 * 		通过注解扫描完成Filter组件的注册
 * @author Administrator
 * 
 * 	<filter>
 *		<filter-name>FirstFilter</filter-name>
 *		<filter-class>com.nari.filter.FirstFilter</filter-class>
 *	</filter>
 *	<filter-mapping>
 *		<filter-name>FirstFilter</filter-name>
 *		<url-pattern>/first</url-pattern>
 *	</filter-mapping>
 *
 */
//@WebFilter(filterName="FirstFilter",urlPatterns={"*.do","*.jsp"})
@WebFilter(filterName="FirstFilter",urlPatterns="/first")
public class FirstFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入Filter");
		chain.doFilter(request, response);
		System.out.println("离开Filter");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
