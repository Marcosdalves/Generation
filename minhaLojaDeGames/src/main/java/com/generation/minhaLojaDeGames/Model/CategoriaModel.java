package com.generation.minhaLojaDeGames.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name= "tb_categorias") 
public class CategoriaModel {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  
	  @NotNull
	  @Size(min=4, max=100)
	  private String descricao;
	  
	  @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) // uma categoria para muitos produtos
	  @JsonIgnoreProperties("categoria")
	  private List <ProdutoModel> produto;  // ow ignora o categoria la do produto model, ai o outro ta falando, ow ignora o produto 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	}
