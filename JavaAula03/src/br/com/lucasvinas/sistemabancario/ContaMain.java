package br.com.lucasvinas.sistemabancario;

public class ContaMain {
	public static void main(String[] args) {
	
		Conta conta = new Conta("Lucas", 1000);

		Conta outraConta = new Conta("Bruno", 2000);


		System.out.println("*==================*");
		System.out.println("-===BANCO  FELIZ===-");
		System.out.println("_==================_");
		System.out.println("");
		System.out.println(Conta.limiteCredito);
		
		
		System.out.println(conta);
		System.out.println(outraConta);
		
		conta.depositar(3000);
		outraConta.sacar(3000);
		
		System.out.println(conta);
		System.out.println(outraConta);
		
		conta.sacar(1000);
		outraConta.depositar(1000);		

		System.out.println(conta);
		System.out.println(outraConta);
		
		
		
		

		System.out.println("*==================*");
		System.out.println("-===BANCO  FELIZ===-");
		System.out.println("_==================_");
	}
}
