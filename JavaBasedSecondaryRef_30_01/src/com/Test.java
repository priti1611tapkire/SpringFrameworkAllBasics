package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		Student st=apc.getBean("m1", Student.class);
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getAddrs().getAreaname());
		System.out.println(st.getAddrs().getCityname());


		Employee ee=apc.getBean("ee", Employee.class);
		System.out.println(ee.getEid());
		System.out.println(ee.getEname());
		System.out.println(ee.getAddr().getAreaname());	
		System.out.println(ee.getAddr().getCityname());
	}
}
