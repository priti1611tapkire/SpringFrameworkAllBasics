package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean
	public Student s(){
		Student stu=new Student(1, "Priti");
		return stu;
		
	}
	
	@Bean
	public Address a(){
		Address add=new Address("KasliwalGarden", "Aurangabad");
		return add;
	}
	
}
