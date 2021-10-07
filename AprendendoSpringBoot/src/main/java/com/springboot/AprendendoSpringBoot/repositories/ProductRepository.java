package com.springboot.AprendendoSpringBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.AprendendoSpringBoot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
