package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {

	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
	Student s=apc.getBean("a", Student.class);
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	String[] s1=s.getMobno();
	for(int i=0; i< s1.length;i++){
		System.out.println(s1[i]);
	}
}
}
