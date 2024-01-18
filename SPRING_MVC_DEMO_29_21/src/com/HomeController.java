package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
public class HomeController {

	@RequestMapping("/log")
	public String m1(){
		System.out.println("Hello");
		return "success";
		
	}
}
