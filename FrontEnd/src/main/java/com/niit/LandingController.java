package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandingController {
	@RequestMapping(value={"/index","/"})
	public ModelAndView page()
	{
		ModelAndView obj1=new ModelAndView("index");
		return obj1;
	}
	@RequestMapping(value={"/home"})
	public ModelAndView homepage()
	{
		ModelAndView obj1=new ModelAndView("home");
		return obj1;
	}
	@RequestMapping(value={"/about"})
	public ModelAndView aboutPage()
	{
		ModelAndView obj1=new ModelAndView("about");
		return obj1;
	}
	@RequestMapping(value={"/contact"})
	public ModelAndView contactPage()
	{
		ModelAndView obj1=new ModelAndView("contact");
		return obj1;
	}
	@RequestMapping(value={"/register"})
	public ModelAndView registerPage()
	{
		ModelAndView obj1=new ModelAndView("register");
		return obj1;
	}
	@RequestMapping(value={"/login"})
	public ModelAndView loginPage()
	{
		ModelAndView obj1=new ModelAndView("login");
		return obj1;
	}
	@RequestMapping(value={"/viewall"})
	public ModelAndView viewallPage()
	{
		ModelAndView obj1=new ModelAndView("viewall");
		return obj1;
	}
	@RequestMapping(value={"/mobile"})
	public ModelAndView mobilePage()
	{
		ModelAndView obj1=new ModelAndView("mobile");
		return obj1;
	}
	@RequestMapping(value={"/computers"})
	public ModelAndView computerPage()
	{
		ModelAndView obj1=new ModelAndView("computers");
		return obj1;
	}
	@RequestMapping(value={"/ac"})
	public ModelAndView acPage()
	{
		ModelAndView obj1=new ModelAndView("ac");
		return obj1;
	}
}
