package br.com.lucasvinas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta{

	private final double TAXA = 0.55;

	public ContaCorrente(double saldo, double limite, String nome) {
		super(saldo, limite, nome);
	}

	@Override
	public void imprimirExtratoDetalhado() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();		
		System.out.println("Conta Corrente");
		System.out.println(sdf.format(agora));
		System.out.println(this.getNome());
		System.out.println(this.getSaldo());
		System.out.println(this.getLimite());		
	}

	@Override
	public boolean sacar(double valor) {
		if (this.getSaldo() + this.getLimite() > valor + TAXA) {
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

}
