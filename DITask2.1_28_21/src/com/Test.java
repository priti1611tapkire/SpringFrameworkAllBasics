package com;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		ArrayClass a=apc.getBean("con", ArrayClass.class);
		//System.out.println(a);
		
		String[] a1=a.getMobileno();
		for(String a2:a1){
			System.out.println(a2);
		}
	}

}
