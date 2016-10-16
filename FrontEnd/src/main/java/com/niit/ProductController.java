package com.niit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.mdimBackEnd.dao.productdao;
import com.niit.mdimBackEnd.model.productmodel;

@Controller
public class ProductController {

	@Autowired
	productdao p;
	@RequestMapping("/product/all")
	public @ResponseBody List<productmodel> getProdduct()
	{
		return p.getAll();
	}
	
	
}
