package com.nari.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 * SpringBoot 整合Listener：
 * @author Administrator
 *	
 *	<listener>
 *		<listener-class>com.nari.listener.FirstListener</listener-class>
 *	</listener>
 */
@WebListener
public class FirstListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Listener...init......");
	}

}
