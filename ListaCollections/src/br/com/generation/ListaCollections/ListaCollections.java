package br.com.generation.ListaCollections;

public class ListaCollections {

	
	//Generation model brasil (loja de tênis)
	
	//Variaveis - atributos
	private String marca;
	private double valor;

	
	
	//poli
	@Override
	public String toString() {
		return "ListaCollections [marca=" + marca + ", valor=" + valor + "]";
	

	//constructor
	}
	public ListaCollections(String marca, double valor) {
		super();
		this.marca = marca;
		this.valor = valor;
		
	
	
	
	
	
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	}

	
	
	