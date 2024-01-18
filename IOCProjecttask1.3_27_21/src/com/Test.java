package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext aps=new FileSystemXmlApplicationContext("Bean.xml");
		Welcome w=(Welcome) aps.getBean("m");
		w.m1();
		w.m2();
	}
}
