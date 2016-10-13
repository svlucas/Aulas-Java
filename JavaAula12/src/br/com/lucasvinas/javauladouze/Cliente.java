package br.com.lucasvinas.javauladouze;

import br.com.lucasvinas.javauladouze.Pessoa;

public class Cliente extends Pessoa {
	
	public Cliente(String nome, double rendaMensal, int dataAniversario) {
		super(nome);
		this.rendaMensal = rendaMensal;
		this.dataAniversario = dataAniversario;
	}
	
	private double rendaMensal;
	private int dataAniversario;
	
	
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public int getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	@Override
	public String toString(){
		return "Nome: " + this.getNome()
			 + "\r\n Aniversario: " + this.getDataAniversario();
	}
}