package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("scope.xml");
		Student s=apc.getBean("a", Student.class);
		System.out.println("abc"+ " " +s);
		System.out.println(s.getAddr());
		System.out.println("============================");
		
		Student s1=apc.getBean("a", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddr());
		System.out.println("============================");
		
		Student s2=apc.getBean("a", Student.class);
		System.out.println(s2);
		System.out.println(s2.getAddr());
		System.out.println("============================");
		
		
		Student s3=apc.getBean("a", Student.class);
		System.out.println(s3);
		System.out.println(s3.getAddr());
		System.out.println("============================");
		
		}
}
