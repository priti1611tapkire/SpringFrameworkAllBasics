package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

		//in ApplicationContext container without getbean method we can create instance of constructor...so that in ApplicationContext singletonescope act as Eagar Loading
		//in ApplicationContext container without getbean method instance not created...so that in ApplicationContext prototypescope act as Lazy Loading
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=apc.getBean("a", Student.class);	//we have compulsory need to write this method when we use scope is prototype
		System.out.println(stu);
		Student stu1=apc.getBean("a", Student.class);	
		System.out.println(stu1);
		Student stu2=apc.getBean("a", Student.class);	
		System.out.println(stu2);
	}
}
