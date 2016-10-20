package com.niit.mdimBackEnd.dao;

import java.util.List;

import com.niit.mdimBackEnd.model.Product;

public interface ProductDAO {
	public List<Product> getAll();

public Product getProductById(int id);
public void removeProduct(int id);
public void addProduct(Product product);
public void updateProduct(Product product);
}
