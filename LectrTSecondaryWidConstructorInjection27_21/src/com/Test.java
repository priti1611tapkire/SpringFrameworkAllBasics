package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		Student stu=ap.getBean("s", Student.class);
		System.out.println(stu);
	}
}
