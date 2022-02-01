package br.com.generation.ClasseObjeto;

public class ObjetoCliente {


	String nome;
	String endereco;
	String login;
	int idade;
	int notaSatisfacao;
	double totalCompra;
	
	
		void login() {
		System.out.println("Login de acesso:" + login);
		}
		void compra() {
		System.out.println("Compra total:" + totalCompra);
		}
		void avaliar() {
		System.out.println("Avalie nosso atendimento:" + notaSatisfacao);	
		}
}
