package br.com.generation.Polimorfismo;

public class Animal {
	
	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("UUUUUUUUUUUH");
		}
		public void emitirSomm() {
		System.out.println("iiiiiiiiih");
		}	
			public void emitirSon() {
		System.out.println("Riiiiiiiiiiiiiiih");
		}
		public void correr() {
		System.out.println("Correndo..");
		}
		public void subirArvore() {
		System.out.println("Subindo em arvore!");
		
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
}
			
			
	