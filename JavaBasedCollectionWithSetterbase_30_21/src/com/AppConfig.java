package com;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student m1(){
		List<String> l=new ArrayList<>();
		l.add("Priya");
		l.add("PINKY");
		
		Set<String> s=new HashSet<>();
		s.add("ABHIJEET");
		s.add("KUNAL");
		
		Map<String, String> m=new HashMap<>();
		m.put("p", "Reena");
		m.put("p1", "Renu");
		
		Student stu=new Student();
		stu.setMyList(l);
		stu.setMySet(s);
		stu.setMyMap(m);
		return stu;
		
	}
}
