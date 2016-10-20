package com.niit;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.mdimBackEnd.dao.ProductDAO;
import com.niit.mdimBackEnd.model.Product;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value = "/product")
	public ModelAndView adminProduct() {
	 ModelAndView mv=new ModelAndView("adminProduct");
	 mv.addObject("products",productDAO.getAll());
	 mv.addObject("pro",new Product());
	 return mv;
	}
	
	
	 @RequestMapping(value = "/insert",method=RequestMethod.POST)
		public String insertdata(@Valid @ModelAttribute("product") Product product,BindingResult results,Model model) {
		 if(results.hasErrors())
		 {
			 model.addAttribute("product", product);
			 model.addAttribute("productData",productDAO.getAll());
			 return ("adminProduct");
			 
		 }
		 if(product.getId()==0){
			 productDAO.addProduct(product);
		 }
		 else{
			 productDAO.updateProduct(product);
		 }
		return "redirect:/admin/product";
	}

	 @RequestMapping(value = "/delete/{pro}")
		public String adminProductDelete(@PathVariable("pro") Integer id ) {
		 productDAO.removeProduct(id);
		 return "redirect:/admin/product";
	}

	 @RequestMapping("/edit/{id}")
		public String editProduct(@PathVariable("id") int id, Model model) {
			model.addAttribute("pro", productDAO.getProductById(id));
			model.addAttribute("products", productDAO.getAll());
			return "adminpage";
		}
	}
	 
	
	
	