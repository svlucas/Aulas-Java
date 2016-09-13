package br.com.lucasvinas;

public class Poligonos {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo("Laranja", 2, 3);
		Circulo circulo = new Circulo("Azul", 3);
		
		System.out.println("Círculo: " + circulo.getCor() + "\nArea: " + circulo.calcularArea());
		System.out.println("Triangulo: " + triangulo.getCor() + "\nArea: " + triangulo.calcularArea());

	}

}
