package com.springboot.AprendendoSpringBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.AprendendoSpringBoot.entities.Category;



@Repository
public interface CateroryRepository extends JpaRepository<Category, Long>{


}
