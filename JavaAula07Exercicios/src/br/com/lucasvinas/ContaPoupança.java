package br.com.lucasvinas;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ContaPoupança extends Conta{

	private int diaAniversario;
	private final double TAXA = 0.50;
	
	public ContaPoupança(double saldo, double limite, String nome, int diaAniversario) {
		super(saldo, limite, nome);
		this.diaAniversario = diaAniversario;
	}	
	
	
	@Override
	public void imprimirExtratoDetalhado() {		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();		
		System.out.println("Conta Poupança");
		System.out.println(sdf.format(agora));
		System.out.println(this.getNome());
		System.out.println(this.getSaldo());
		System.out.println(this.getLimite());
		System.out.println(this.getDiaAniversario());
	}

	@Override
	public boolean sacar(double valor) {
		if (this.getSaldo() + this.getLimite()> valor + TAXA) {
			this.setSaldo(this.getSaldo() - valor - TAXA);
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		try
		{
			this.setSaldo(this.getSaldo() + valor - TAXA);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

	
	public int getDiaAniversario() {
		return diaAniversario;
	}

}
