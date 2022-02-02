package br.com.generation.Polimorfismo;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	//System.out.println("Digite o nome do animal:");
	//String nome = entrada.next();
	//System.out.println("Digite Idade:");
	//String idade = entrada.next();
	
	Cachorro cao1 = new Cachorro();
	Cavalo cav1 = new Cavalo();
	Preguiça preg01 = new Preguiça();
	
	cao1.setNome("Cachorro - Kyra");
	cao1.setIdade(10);
	System.out.println("Nome:" + cao1.getNome());
	System.out.println("Idade:" + cao1.getIdade());
	cao1.emitirSom();
	cao1.correr();
	
	System.out.println();
	
	
	cav1.setNome("Cavalo - Troia");
	cav1.setIdade(5);
	System.out.println("Nome:" + cav1.getNome());
	System.out.println("Idade:" + cav1.getIdade());
	cao1.emitirSomm();
	cao1.correr();
	
	System.out.println();
	
	
	
	preg01.setNome("Preguiça - Sono");
	preg01.setIdade(1);
	System.out.println("Nome:" + preg01.getNome());
	System.out.println("Idade:" + preg01.getIdade());
	preg01.emitirSon();
	preg01.subirArvore();
	
	
	
	

	


	}
}
