package br.com.lucasvinas;

public class Triangulo extends FiguraGeometrica implements AreaCalculavel{

	private int base;
	private int altura;
		
	public Triangulo(String cor, int base, int altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
}
