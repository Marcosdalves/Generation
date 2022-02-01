package br.com.generation.ClasseObjeto;

import java.util.Scanner;

public class ObjetoAviao {
	
	
	String modelo;
	String marca;
	int anoFabricacao;
	int quantidadeAssentos;
	int velocidade;
	
	
	void decolar(int aceleracao) {
	velocidade = velocidade + aceleracao;
	}
	void aterrizar( int aceleracao) {
	velocidade = aceleracao;
	
	}
	

}
