package br.com.lucasvinas;

public class Engenheiro extends Funcionario{

	@Override
	public double quantiaAPagar() {
		return this.getSalario() + 300;
	}

	
}
