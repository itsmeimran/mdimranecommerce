package com.niit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.mdimBackEnd.dao.ProductDAO;
import com.niit.mdimBackEnd.model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO p;
	@RequestMapping("/product/all")
	public @ResponseBody List<Product> getProdduct()
	{
		return p.getAll();
	}
	
	
}
