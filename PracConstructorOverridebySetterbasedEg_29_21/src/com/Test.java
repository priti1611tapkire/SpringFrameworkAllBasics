package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Student s=ap.getBean("a", Student.class);
		System.out.println("Roll Number:" +s.getRollno());
		System.out.println("Name:" +s.getName());
	}
}
