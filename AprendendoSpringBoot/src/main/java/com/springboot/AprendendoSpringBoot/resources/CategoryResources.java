package com.springboot.AprendendoSpringBoot.resources;

import com.springboot.AprendendoSpringBoot.entities.Category;
import com.springboot.AprendendoSpringBoot.repositories.CateroryRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	private CateroryRepository cr;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> lista = cr.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category cat = cr.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}
