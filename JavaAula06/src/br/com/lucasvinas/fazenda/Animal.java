package br.com.lucasvinas.fazenda;

public class Animal {

	private String nome;
	private int idade;
	
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	
	public String getNome() {
		return nome;
	}



	public int getIdade() {
		return idade;
	}



	public void comer(){
		System.out.println("Comer");
	}
	
	public void emitirSom(){
		System.out.println("Som!!");
	}
}
