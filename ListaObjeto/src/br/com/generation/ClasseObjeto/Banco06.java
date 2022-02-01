package br.com.generation.ClasseObjeto;

public class Banco06 {

	public static void main(String[] args) {
		
	ObjetoBanco a1 = new ObjetoBanco();
	
	a1.nome = "Marcos Alves";
	a1.agencia = "123456";
	a1.idade = 20;
	a1.apolice = "Aprovado";
	
	System.out.println("Nome: " + a1.nome);
	System.out.println("Idade:" + a1.idade);

	
	a1.entrada();
	a1.aprovacao();
	
	

	}

}
