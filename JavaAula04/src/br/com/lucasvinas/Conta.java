package br.com.lucasvinas;

public class Conta {

	private int numero;
	private int agencia;
	private Cliente titular;
	private double saldo;
	private double limite;
	
	public Conta(int numero, int agencia, Cliente titular, double saldo, double limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean sacar(double valor) {
		if (this.saldo + this.limite > valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}

	public void imprimirTitular() {
		System.out.println(this.titular.getNome());
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void tranferencia(Conta contaDestino, double valor) {
		if(this.sacar(valor)){
			contaDestino.depositar(valor);			
		} else {
			System.out.println("Não foi possível realizar a transferência");
		}
	}

	public void imprimeExtrato() {
			System.out.println("**************************");
			System.out.println("*****BANCO----CAZALBÊ*****");
			System.out.println("*------------------------*");
			System.out.println("* AGÊNCIA: " + this.agencia);
			System.out.println("* CONTA: " + this.numero);
			System.out.println("* TITULAR: " + this.titular.getNome());
			System.out.println("*------------------------*");
			System.out.println("Saldo em Conta: " + this.saldo);
			System.out.println("*------------------------*");
			System.out.println("Antes de imprimir pense\r\nna vida das pobres arveres");
			System.out.println("*________________________*");
	}

	@Override
	public String toString() {
		return "Infeliz: " + this.titular.getNome() + "\r\n" + "Número: " + this.numero + "\r\n" + "Saldo: "
				+ this.saldo + "\r\n" + (this.saldo > this.limite ? "Ta fácil a vida " : "Complicado");
	}
}
