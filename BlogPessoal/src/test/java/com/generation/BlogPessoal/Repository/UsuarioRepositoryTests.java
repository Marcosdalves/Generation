package com.generation.BlogPessoal.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import java.util.List;
import com.generation.BlogPessoal.model.UsuarioModel;
import com.generation.BlogPessoal.repository.UsuarioRepository;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //indica que o teste tem começo meio e fim

public class UsuarioRepositoryTests {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start(){
		
		usuarioRepository.save(new UsuarioModel(0L, "Matheus Navarro Alves", "matheusalves@email.com.br", "13465278", "https://i.imgur.com/FETvs2O.jpg"));
		
		usuarioRepository.save(new UsuarioModel(0L, "Igor Luiz Alves", "igorluiz@email.com.br", "13465278", "https://i.imgur.com/NtyGneo.jpg"));
		
		usuarioRepository.save(new UsuarioModel(0L, "Luiz Igor Alves", "luizigor@email.com.br", "13465278", "https://i.imgur.com/mB3VM2N.jpg"));

        usuarioRepository.save(new UsuarioModel(0L, "Wagner Robson Silva", "wagnerrobson@email.com.br", "13465278", "https://i.imgur.com/JR7kUFU.jpg"));
	}
	
	@Test
	@DisplayName("Retorna 1 usuário")
	public void deveRetornarUmUsuario() {
		
		Optional<UsuarioModel> usuario = usuarioRepository.findByUsuario("matheusalves@email.com.br");
		assertTrue(usuario.get().getUsuario().equals("matheusalves@email.com.br"));
	
	}
	@Test
	@DisplayName("Retorna 3 usuarios") //
	public void deveRetornarTresUsuarios() {
		
		List<UsuarioModel> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Alves");
		assertEquals (3, listaDeUsuarios.size());
		
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Matheus Navarro Alves"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Igor Luiz Alves"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Luiz Igor Alves"));
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
	
}
	
