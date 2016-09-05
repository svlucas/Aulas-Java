package br.com.lucasvinas.fazenda;

public class Vaca extends Animal {

	public Vaca(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom(){
		System.out.println("Muuuuuuuu");
	}
}
