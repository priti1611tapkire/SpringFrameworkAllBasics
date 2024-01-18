package com;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student m1(){
		List l=new ArrayList<>();
		l.add("ABC");
		l.add("PQR");
		
		Set s=new HashSet<>();
		s.add("mnp");
		s.add("kfc");
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("k", "PRITI");
		m.put("k1", "PRATIKSHA");
		
		return new Student(l, s, m); 
		
	}
}
