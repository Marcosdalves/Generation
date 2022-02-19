package com.generation.exercicio2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/exercicio2")



public class Exercicio2Controller {
	@GetMapping 
	
	public String exercicio2() {
		return "<h1>Habilidades e Mentalidades</h1>" +
	               "<ul><li>Habilidade:Persistência</li>" +
	               "<li>Mentalidade:Atenção aos detalhes</li></ul>";
	
	
}}
