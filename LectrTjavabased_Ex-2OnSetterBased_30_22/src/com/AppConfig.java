package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	@Bean(name="s1")
	public Student s(){
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("Priti");
		return stu;
	}
}
