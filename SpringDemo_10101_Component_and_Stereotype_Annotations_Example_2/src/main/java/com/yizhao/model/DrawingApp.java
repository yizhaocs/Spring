package com.yizhao.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[] args) {
		usingStringWithApplicationContext();
	}
		
	@SuppressWarnings("resource")
	public static void usingStringWithApplicationContext() {		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Shape shapeCircle = (Shape) context.getBean("circle");;
		shapeCircle.draw();
	}
}


