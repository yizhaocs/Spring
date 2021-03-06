package com.yizhao.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", "
				+ getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", "
				+ getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", "
				+ getPointC().getY() + ")");
	}

	public void initMethod() {
		System.out.println("initMethod method called for Triangle");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod method called for Triangle");
	}
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("InitializingBean init method called for Triangle");
//
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("DisposableBean destroy method called for Triangle");
//	}

}
