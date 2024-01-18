package com.applicationcontext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[] args) {
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("ClassPathXmlApplicationContext");
		Connection c=(Connection) aps.getBean("con");
		
		System.out.println("BeanFactory");
		Resource r=new ClassPathResource("Bean.xml");
		BeanFactory bean=new XmlBeanFactory(r);
		Connection c1=(Connection) bean.getBean("con");
		
		c.commit();
		c.rollback();
	}
}
