package br.com.lucasvinas;

public class ContaTeste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100.00, 750.00, "Alisson");
		ContaPoupan�a cp = new ContaPoupan�a(5000.00, 50.00, "Alisson", 23);
		
		
		cc.imprimirExtratoDetalhado();
		cp.imprimirExtratoDetalhado();

	}

}
