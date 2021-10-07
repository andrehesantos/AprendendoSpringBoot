package com.springboot.AprendendoSpringBoot.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.AprendendoSpringBoot.entities.Product;

@Component
public class ProductRepository {

	private Map<Long, Product> map = new HashMap<>();
	
	public void save(Product cat) {
		map.put(cat.getId_produto(), cat);
	}
	
	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll(){
		return new ArrayList<Product>(map.values());
	}
}
