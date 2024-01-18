package com;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");

		Student stu=apc.getBean("s", Student.class);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr().getAreaname());
		System.out.println(stu.getAddr().getCityname());

		Employee e=apc.getBean("e", Employee.class);
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getAddr().getAreaname());
		System.out.println(e.getAddr().getCityname());
	}
}
