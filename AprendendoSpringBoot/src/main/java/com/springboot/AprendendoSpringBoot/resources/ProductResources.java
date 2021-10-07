package com.springboot.AprendendoSpringBoot.resources;

import com.springboot.AprendendoSpringBoot.entities.Product;
import com.springboot.AprendendoSpringBoot.repositories.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
	
	@Autowired
	private ProductRepository pr;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> lista = pr.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product cat = pr.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}
