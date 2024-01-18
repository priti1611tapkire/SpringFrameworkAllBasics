package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
	ArrayClass a=apc.getBean("c", ArrayClass.class);
	
	System.out.println(a.getRollno());
	System.out.println(a.getName());
	Address[] aa=a.getAddr();
	for(Address a2:aa){
		System.out.println(a2.getCity());
		System.out.println(a2.getArea());
	}
	
}
}
