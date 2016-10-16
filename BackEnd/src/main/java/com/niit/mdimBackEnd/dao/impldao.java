package com.niit.mdimBackEnd.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.mdimBackEnd.model.productmodel;

@Repository
public class impldao implements productdao{

	
	
	List<productmodel> prod;
	
	public impldao()
	{
		prod=new ArrayList<productmodel>();
		
		
		productmodel p1=new productmodel();
		p1.setId(101);
		p1.setName("Dell Laptop");
		p1.setPrice(35000);
		productmodel p2=new productmodel();
		p2.setId(201);
		p2.setName("Sony TV");
		p2.setPrice(55000);
		productmodel p3=new productmodel();
		p3.setId(301);
		p3.setName("Samsung AC");
		p3.setPrice(40000);
		productmodel p4=new productmodel();
		p4.setId(103);
		p4.setName("HP Laptop");
		p4.setPrice(30000);
		productmodel p5=new productmodel();
		p5.setId(106);
		p5.setName("Sony Laptop");
		p5.setPrice(42000);
		productmodel p6=new productmodel();
		p6.setId(206);
		p6.setName("Samsung TV");
		p6.setPrice(25000);
		productmodel p7=new productmodel();
		p7.setId(209);
		p7.setName("LG TV");
		p7.setPrice(28000);
		productmodel p8=new productmodel();
		p8.setId(303);
		p8.setName("Voltas AC");
		p8.setPrice(29000);
		
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		prod.add(p4);
		prod.add(p5);
		prod.add(p6);
		prod.add(p7);
		prod.add(p8);
		
		
	}

	public List<productmodel> getAll() {
		
		return prod;
	}

}
