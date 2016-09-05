package br.com.lucasvinas.fazenda;

public class Cachorro extends Animal{

	private boolean domestico;
	
	public Cachorro(String nome, int idade, boolean domestico) {
		super(nome, idade);
		this.domestico = domestico;
		// TODO Auto-generated constructor stub
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	@Override
	public void emitirSom(){
		System.out.println("Au aU!");
	}
}
