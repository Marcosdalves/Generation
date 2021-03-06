package com.generation.BlogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.BlogPessoal.model.PostagemModel;

//public interface PostagensRepository {
	
	@Repository
    public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
    
	public List<PostagemModel> findAllByTituloContainingIgnoreCase (String titulo);
    
	//public List<PostagemModel> findAllByTextoContainingIgnoreCase (String texto);
}

