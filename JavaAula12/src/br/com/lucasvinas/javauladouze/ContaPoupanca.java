package br.com.lucasvinas.javauladouze;

import br.com.lucasvinas.javauladouze.Cliente;
import br.com.lucasvinas.javauladouze.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca(int numeroConta, Cliente cliente, double saldo, double limite) {
		super(numeroConta, cliente, saldo);
		this.limite = limite;
	}

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double sacar(double valor) {
		double valorSacado = 0;
		if(this.getSaldo() - valor + limite > 0 && valor >= 0){
			valorSacado = valor;
			this.setSaldo(this.getSaldo() - valor);
		}
		return valorSacado;
	}

	@Override
	public double depositar(double valor) {
		double valorDepositado = 0;
		if(this.getSaldo() + valor + limite >= 0 && valor >= 0){
			valorDepositado = valor;
			this.setSaldo(this.getSaldo() + valor - limite);
		}
		return valorDepositado;
	}

	@Override
	public double consultarSaldo() {
		return this.getSaldo();
	}

	@Override
	public double transferir(ContaBancaria contaDestino, double valor) {
		double valorTransferido = 0;
		if(this.getSaldo() - valor + limite > 0 && valor >= 0){
			valorTransferido = valor;
			this.setSaldo(this.getSaldo() - valor);
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		}
		return valorTransferido;
	}
}
