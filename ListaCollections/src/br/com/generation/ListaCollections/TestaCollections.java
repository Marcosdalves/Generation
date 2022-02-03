package br.com.generation.ListaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaCollections {

	public static void main(String[] args) {
		
	Scanner enter = new Scanner(System.in);
	ArrayList<ListaCollections> collections = new ArrayList <>();
	
	System.out.println("Quantos pares de t�nis foram vendidos: ");
	int quantidadeVendidos = enter.nextInt();
	enter.nextLine(); //
	
	for(int i = 0; i< quantidadeVendidos; i++) { //
		
		System.out.println("Valor do T�nis: ");
		double valor =enter.nextDouble();
		enter.nextLine(); 
		
		System.out.println("Marca do T�nis ");
		String marca = enter.next();
		
		collections.add(new ListaCollections(marca, valor));
		}
	enter.close();
	}
}