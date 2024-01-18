package com;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
	Student stu=apc.getBean("s", Student.class);
	
	System.out.println(stu);
}
}
