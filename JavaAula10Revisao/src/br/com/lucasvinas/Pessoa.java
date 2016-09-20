package br.com.lucasvinas;

public abstract class Pessoa {

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
