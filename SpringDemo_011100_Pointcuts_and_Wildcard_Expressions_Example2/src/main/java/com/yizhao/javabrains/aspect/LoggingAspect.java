package com.yizhao.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String com.yizhao.javabrains.model.Circle.getName())")
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method called");
	}
}
