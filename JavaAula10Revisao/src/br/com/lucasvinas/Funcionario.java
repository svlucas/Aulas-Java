package br.com.lucasvinas;

public class Funcionario extends Pessoa {

	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
