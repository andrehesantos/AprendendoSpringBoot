package com.springboot.AprendendoSpringBoot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.AprendendoSpringBoot.repositories.CateroryRepository;
import com.springboot.AprendendoSpringBoot.repositories.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.AprendendoSpringBoot.entities.Category;
import com.springboot.AprendendoSpringBoot.entities.Product;

@SpringBootApplication
public class AprendendoSpringBootApplication implements CommandLineRunner {

	@Autowired
	private CateroryRepository cr;
	
	@Autowired
	private ProductRepository pr;
	
	public static void main(String[] args) {
		SpringApplication.run(AprendendoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L,"Eletronicos");
		Category cat2 = new Category(2L,"Livros");
		
		Product p1 = new Product(1L, "TV", 2200, cat1);
		Product p2 = new Product(2L, "JAVA", 49.99, cat2);
		Product p3 = new Product(3L, "Celular", 890, cat1);
		Product p4 = new Product(4L, "Capitães da Areia", 39.99, cat2);
		
		cat1.getLista_produtos().addAll(Arrays.asList(p1,p3));
		cat1.getLista_produtos().addAll(Arrays.asList(p2,p4));
		
		cr.save(cat1);
		cr.save(cat2);
		
		pr.save(p1);
		pr.save(p2);
		pr.save(p3);
		pr.save(p4);
	}

}
