package br.com.lucasvinas;

public class Carros extends Veiculos {

	private double hp;

	public Carros(int ano, String cor, int km, String modelo, double valor, String fabricante, String licença,
			double hp) {
		super(ano, cor, km, modelo, valor, fabricante, licença);
		this.hp = hp;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		if(hp >= 0)
		this.hp = hp;
	}
	
}
