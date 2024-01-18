package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
	Student stu=apc.getBean("m1", Student.class);
	System.out.println(stu);
}
}
