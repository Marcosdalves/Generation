package com.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/exercicio1")


public class exercicio1Controller {
	@GetMapping 
	
	public String exercicio1() {
		return "<h1>Objetivos de aprendizagem</h1>" +
	               "<ul><li>Executar com primazia o MySQL</li>" +
	               "<li>Sanar o máximo de erros possíveis</li></ul>";
	}}
