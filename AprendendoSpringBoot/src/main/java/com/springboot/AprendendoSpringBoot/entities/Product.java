package com.springboot.AprendendoSpringBoot.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private Long id_produto;
	private String nome_produto;
	private double valor_produto;
	
	private Category categoria_produto;
	
	public Product() {
		
	}

	public Product(Long id_produto, String nome_produto, double valor_produto, Category categoria_produto) {
		super();
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.categoria_produto = categoria_produto;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}

	public Category getCategoria_produto() {
		return categoria_produto;
	}

	public void setCategoria_produto(Category categoria_produto) {
		this.categoria_produto = categoria_produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id_produto, other.id_produto);
	}
	
	
}
