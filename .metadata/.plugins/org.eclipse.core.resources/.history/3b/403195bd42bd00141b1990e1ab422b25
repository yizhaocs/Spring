 package com.yizhao.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
	}
	
	@Before("args(name)")
	public void beforeAdvise(String name) {
		System.out.println("@Before Advise method called");
	}
	
	@After("args(name)")
	public void afterAdvise(String name) {
		System.out.println("@After Advise method called");
	}
	
	@AfterReturning("args(name)")
	public void afterReturingAdvise(String name) {
		System.out.println("@AfterReturning Advise method called");
	}
	 
	@AfterThrowing("args(name)")
	public void afterThrowingAdvise(String name) {
		System.out.println("@AfterThrowing Advise method called");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(com.yizhao.javabrains.model.Circle)")
	public void allCircleMethods() {}
}
