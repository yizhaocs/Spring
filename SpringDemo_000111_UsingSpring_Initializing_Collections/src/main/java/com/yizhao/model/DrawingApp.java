package com.yizhao.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[] args) {
		usingStringWithApplicationContext();
	}
		
	@SuppressWarnings("resource")
	public static void usingStringWithApplicationContext() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}
}


