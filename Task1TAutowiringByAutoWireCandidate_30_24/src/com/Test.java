package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=apc.getBean("s", Employee.class);
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getAdhrdetails().getAdharno());
		System.out.println(emp.getAdhrdetails().getAdharregno());
		
		
		HrPannel h=apc.getBean("e", HrPannel.class);
		System.out.println(h.getHid());
		System.out.println(h.getHname());
		System.out.println(h.getAdhrdet().getAdharno());
		System.out.println(h.getAdhrdet().getAdharregno());

	}
}
