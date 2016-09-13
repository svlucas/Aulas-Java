package br.com.lucasvinas;

public class Circulo extends FiguraGeometrica implements AreaCalculavel{

	private int raio;
	
	public Circulo(String cor, int raio) {
		super(cor);
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(raio, 2) * Math.PI);
	}

}
