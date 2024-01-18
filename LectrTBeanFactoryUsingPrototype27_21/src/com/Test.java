package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
//		Resource rs=new ClassPathResource("bean.xml");
//		BeanFactory bf=new XmlBeanFactory(rs);
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Student s=ap.getBean("a", Student.class);
		System.out.println(s);
//		
//		Student s=bf.getBean("a", Student.class);
//		System.out.println(s);
//		
//		Student s1=bf.getBean("a", Student.class);
//		System.out.println(s1);
//		
//		Student s2=bf.getBean("a", Student.class);
//		System.out.println(s2);
//		
	}

}
