package com.springboot.AprendendoSpringBoot.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.AprendendoSpringBoot.entities.Category;

@Component
public class CateroryRepository {

	private Map<Long, Category> map = new HashMap<>();
	
	public void save(Category cat) {
		map.put(cat.getId_category(), cat);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}
}
