package br.com.generation.ClasseObjeto;

import java.util.Scanner;

public class Aviao02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ObjetoAviao a1 = new ObjetoAviao();
		
		
		a1.modelo= "Airbus 380";
		a1.marca = "Airbus";
		a1.anoFabricacao = 2007;
		a1.quantidadeAssentos = 1000;
		
		System.out.println("Modelo:"+ a1.modelo);
		System.out.println("Marca:" + a1.marca);
		System.out.println("Ano de Fabricação: " + a1.anoFabricacao);
		System.out.println("Quantidade de Assentos:" + a1.quantidadeAssentos);
		
	
		
		a1.decolar(200); 
		System.out.println("Velocidade decolagem:" + a1.velocidade+ "km/h");
		
		a1.aterrizar(280);
		System.out.println("Velocidade aterrisagem:" + a1.velocidade + "km/h");
		
		
		
		a1.decolar(200);
		a1.aterrizar(280);
		}
		}