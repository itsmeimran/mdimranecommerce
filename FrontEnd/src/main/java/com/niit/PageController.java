package com.niit;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller


public class PageController {
	/*
	@RequestMapping(value = {"/home", "/index" , "/"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifUserHasClickedHome", true);		
		mv.addObject("title", "Home");
		return mv;		
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("ifUserHasClickedAbout", true);
		mv.addObject("title", "About");
		return mv;		
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("ifUserHasClickedContact", true);
		mv.addObject("title", "Contact Us");
		return mv;		
	}
	
	
	 @RequestMapping(value = "/product")
	public ModelAndView viewAllProducts() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("ifUserHasClickedAllProducts", true);
		mv.addObject("title", "All Products");
		return mv;		
	}

	
	
	@RequestMapping(value = "/product/{category}")
	public ModelAndView viewProductsByCategory(@PathVariable("category")String category) {		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("category", category);
		mv.addObject("ifUserHasClickedAllProducts", true);
		mv.addObject("title", category + " Products");
		return mv;		
	}

	*/

}



