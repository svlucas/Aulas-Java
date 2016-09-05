package br.com.lucasvinas;

public class Motos extends Veiculos {

	private int cilindradas;

	public Motos(int ano, String cor, int km, String modelo, double valor, String fabricante, String licen�a,
			int cilidradas) {
		super(ano, cor, km, modelo, valor, fabricante, licen�a);
		this.cilindradas = cilidradas;
	}
	public int getCilidradas() {
		return cilindradas;
	}
	public void setCilidradas(int cilindradas) {
		if(cilindradas > 0)
		this.cilindradas = cilindradas;
	}
	
	
}
