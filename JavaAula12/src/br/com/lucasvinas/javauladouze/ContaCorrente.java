package br.com.lucasvinas.javauladouze;

import br.com.lucasvinas.javauladouze.Cliente;
import br.com.lucasvinas.javauladouze.ContaBancaria;

public class ContaCorrente extends ContaBancaria{

	private static double taxaOperacao = 1.00;

	public ContaCorrente(int numeroConta, Cliente cliente, double saldo) {
		super(numeroConta, cliente, saldo);
	}

	@Override
	public double sacar(double valor) {
		double valorSacado = 0;
		if(this.getSaldo() - valor - taxaOperacao >= 0 && valor >= 0){
			valorSacado = valor;
			this.setSaldo(this.getSaldo() - valor - taxaOperacao);
		}		
		return valorSacado;
	}

	@Override
	public double depositar(double valor) {
		double valorDepositado = 0;
		if(this.getSaldo() + valor - taxaOperacao >= 0 && valor >= 0){
			valorDepositado = valor;
			this.setSaldo(this.getSaldo() + valor - taxaOperacao);
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
		if(this.getSaldo() - valor - taxaOperacao >= 0 && valor >= 0){
			valorTransferido = valor;
			this.setSaldo(this.getSaldo() - valor - taxaOperacao);
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		}
		return valorTransferido;
	}
}