package br.com.lucasvinas;

public abstract class Conta {

	private double saldo;
	private double limite;
	private String nome;
	public abstract void imprimirExtratoDetalhado();
	public abstract boolean sacar(double valor);
	public abstract boolean depositar(double valor);

	
	
	
	public Conta(double saldo, double limite, String nome) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
