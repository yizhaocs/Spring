package com.yizhao.model;

import javax.annotation.Resource;


public class Circle implements Shape {

	private Point center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", "
				+ center.getY() + ")");

	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="point3")
	public void setCenter(Point center) {
		this.center = center;
	}

}
