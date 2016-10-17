package com.niit.mdimBackEnd.dao;

import java.util.List;

import com.niit.mdimBackEnd.model.Product;

public interface ProductDAO {
	public List<Product> getAll();
	public void insert(Product p);

}
