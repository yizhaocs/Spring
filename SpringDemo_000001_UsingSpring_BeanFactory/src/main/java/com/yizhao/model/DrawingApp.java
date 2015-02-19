package com.yizhao.model;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[] args) {
		usingStringWithBeanFactory();
	}
	
	@SuppressWarnings("resource")
	public static void usingStringWithBeanFactory() {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle t = (Triangle) factory.getBean("triangle");;
		t.draw();
	}
}


