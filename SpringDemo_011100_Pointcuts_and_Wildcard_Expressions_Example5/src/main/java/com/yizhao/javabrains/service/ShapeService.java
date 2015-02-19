package com.yizhao.javabrains.service;

import com.yizhao.javabrains.model.Circle;
import com.yizhao.javabrains.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
