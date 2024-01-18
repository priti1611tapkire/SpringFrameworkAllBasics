package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu1=apc.getBean("s1", Student.class);
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddr().getAreaname());
		System.out.println(stu1.getAddr().getCityname());
		
	}
}
