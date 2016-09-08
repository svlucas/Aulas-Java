package br.com.lucasvinas;

public class Vendedor extends Funcionario{

	@Override
	public double quantiaAPagar() {
		return this.getSalario() + 500;
	}
	
	
}
