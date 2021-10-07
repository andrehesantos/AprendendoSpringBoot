package com.springboot.AprendendoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.AprendendoSpringBoot.repositories.CateroryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.AprendendoSpringBoot.entities.Category;

@SpringBootApplication
public class AprendendoSpringBootApplication implements CommandLineRunner {

	@Autowired
	private CateroryRepository cr;
	
	public static void main(String[] args) {
		SpringApplication.run(AprendendoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L,"Eletronicos");
		Category cat2 = new Category(2L,"Livros");
		
		cr.save(cat1);
		cr.save(cat2);
	}

}
