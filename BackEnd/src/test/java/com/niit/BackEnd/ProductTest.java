package com.niit.BackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mdimBackEnd.dao.ProductDAO;
import com.niit.mdimBackEnd.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
		ctxt.scan("com.niit");
		ctxt.refresh();
		
		ProductDAO productDAO = ctxt.getBean(ProductDAO.class);
		
		
		Product p = new Product();
		p.setName("Imran");
		p.setPrice(12345);
		
		productDAO.insert(p);
		
		p = new Product();
		p.setName("Imran");
		p.setPrice(12345);
		productDAO.insert(p);
		
		ctxt.close();
		
	}

}
