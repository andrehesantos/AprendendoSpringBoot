package com.springboot.AprendendoSpringBoot.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	private long id_category;
	private String nome_category;
	
	@JsonIgnore
	private List<Product> lista_produtos = new ArrayList<>();
	
	public Category() {
		
	}
	
	public Category(Long id, String nome) {
		super();
		this.id_category = id;
		this.nome_category = nome;
	}

	public long getId_category() {
		return id_category;
	}

	public void setId_category(long id_category) {
		this.id_category = id_category;
	}

	public String getNome_category() {
		return nome_category;
	}

	public void setNome_category(String nome_category) {
		this.nome_category = nome_category;
	}
	
	public List<Product> getLista_produtos() {
		return lista_produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_category);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return id_category == other.id_category;
	}
	
	
}
