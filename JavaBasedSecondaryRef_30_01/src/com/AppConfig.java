package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Student m1(){
		Student s=new Student();
		s.setRollno(1);
		s.setName("Priti");

		Address a=new Address();
		a.setAreaname("KasliwalGarden");
		a.setCityname("Aurangabad");
		s.setAddrs(a);
		return s;
	}
	@Bean(name="ee")
	public Employee m2(){
		Employee e=new Employee();
		e.setEid(2);
		e.setEname("Pratiksha");
		
		Address a1=new Address();
		a1.setAreaname("Nakshtram");
		a1.setCityname("Aurangabad");
		e.setAddr(a1);
		return e;
	}
}
