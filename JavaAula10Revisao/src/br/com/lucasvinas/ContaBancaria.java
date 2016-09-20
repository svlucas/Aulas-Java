package br.com.lucasvinas;


public abstract class ContaBancaria implements Imprimivel{
	
	public ContaBancaria(int numeroConta, Cliente cliente, Gerente gerenteResponsavel, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.gerenteResponsavel = gerenteResponsavel;
		this.saldo = saldo;
	}
	
	private int numeroConta;
	private Cliente cliente;
	private Gerente gerenteResponsavel;
	private double saldo;
	
	public abstract double sacar(double valor);
	public abstract double depositar(double valor);
	public abstract double consultarSaldo();
	public abstract double transferir(ContaBancaria contaDestino, double valor);
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Gerente getGerenteResponsavel() {
		return gerenteResponsavel;
	}
	public void setGerenteResponsavel(Gerente gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		return true;
	}
}
