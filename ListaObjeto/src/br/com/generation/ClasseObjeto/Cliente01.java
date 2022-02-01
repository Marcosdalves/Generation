package br.com.generation.ClasseObjeto;

public class Cliente01 {

	public static void main(String[] args) {
		
		ObjetoCliente m1 = new ObjetoCliente();
		
		m1.nome = "Marcos";
		m1.endereco = "Rua João Alfredo, 10";
		m1.idade =  30;
		m1.notaSatisfacao = 8;
		m1.totalCompra = 300;
		m1.login = "Marcosalves@gmail.com";
		
		System.out.println("Nome: " + m1.nome);
		System.out.println("Endereço:" +m1.endereco);
		System.out.println("Idade:" + m1.idade);
		
		
		
		m1.login();
		m1.compra();
		m1.avaliar();
		
	}}