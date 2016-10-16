package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/welcome")
	public ModelAndView hello()
	{
		ModelAndView model=new ModelAndView("index");
		return model;
		
		
	}
	

}
