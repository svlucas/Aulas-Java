package br.com.lucasvinas;

public class Gerente extends Funcionario{

	@Override
	public double quantiaAPagar() {
		return this.getSalario() + 400;
	}
	
		
}
