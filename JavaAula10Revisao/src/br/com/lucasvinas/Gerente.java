package br.com.lucasvinas;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public double aplicarBonificacao(double valor){
		return this.getSalario() + valor;
	}
	@Override
	public String toString(){
		return "Nome: " + this.getNome();
	}
}
