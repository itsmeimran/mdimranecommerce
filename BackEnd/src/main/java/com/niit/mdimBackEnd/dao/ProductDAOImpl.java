package com.niit.mdimBackEnd.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mdimBackEnd.model.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Product> getAll() {				
		return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
	}

	@Override
	public void insert(Product p) {
		sessionFactory.getCurrentSession().persist(p);
		
	}

}
