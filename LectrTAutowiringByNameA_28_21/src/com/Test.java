package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		Student s=apc.getBean("s", Student.class);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress().getAreaname());
		System.out.println(s.getAddress().getCityname());
	}
}
