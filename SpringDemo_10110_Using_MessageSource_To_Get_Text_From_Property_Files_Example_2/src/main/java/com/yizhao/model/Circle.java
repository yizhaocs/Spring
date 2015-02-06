package com.yizhao.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override 
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", "
				+ center.getY() + ")");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));

	}

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of Circle");
	}

	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destory of Circle");
	}
}
