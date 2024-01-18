package com;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		Student stu1=apc.getBean("m1", Student.class);
		stu1.getMyList();
		stu1.getMySet();
		stu1.getMyMap();

		List<String> s=stu1.getMyList();
		for(String s1:s){
			System.out.println(s1);
		}

		Set<String> s2=stu1.getMySet();
		for(String s3:s2){
			System.out.println(s3);
		}

		Map<String, String> m=stu1.getMyMap();
		Set<String> m2=m.keySet();
		for(String s4:m2){
			String s6=m.get(s4);
			System.out.println(s6);
		}
	}
}
