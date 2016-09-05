package br.com.lucasvinas.sistemabancario;

public class Conta {

	int iD;
	private String proprietario;
	private double saldo;
	public static double limiteCredito = 750;
	
	public Conta(String nome, double saldo){
		this.proprietario = nome;
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public Boolean sacar(double valor){
		if(this.saldo - valor >= 0){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String getNome(){
		return proprietario;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	
	@Override
	public String toString(){
		return "Nome: " + this.proprietario + "\n"
			 + "Saldo: " + this.saldo;
	}
}
