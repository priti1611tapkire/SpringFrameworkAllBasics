package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	Student s=ap.getBean("a",Student.class);
	System.out.println("RollNo:"+s.getRollno());
	System.out.println("Name:"+s.getName());
	System.out.println("Area:"+s.getAddr().getAreaname());
	System.out.println("City: "+s.getAddr().getCityname());
}
}
