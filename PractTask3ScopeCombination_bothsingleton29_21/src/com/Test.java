package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("scope.xml");
		Student s=apc.getBean("a", Student.class);
		System.out.println(s);
		System.out.println(s.getAddr());
		System.out.println("============================");
		
		Student s1=apc.getBean("a", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddr());
		System.out.println("============================");
		
		}
}
