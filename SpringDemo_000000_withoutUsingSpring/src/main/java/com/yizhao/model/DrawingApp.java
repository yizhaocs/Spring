package com.yizhao.model;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[] args) {
		withoutUsingString();
	}
	
	public static void withoutUsingString() {
		Triangle t = new Triangle();
		t.draw();
	}
}


