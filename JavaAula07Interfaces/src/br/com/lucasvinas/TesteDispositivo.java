package br.com.lucasvinas;

public class TesteDispositivo {

	public static void main(String[] args) {
		SuperPrinter sp = new SuperPrinter("HP", "XPTO", "Black Piano", 45643123);
		sp.copiarDocumento("Documento", 1);
		System.out.println(sp.digitalizarDocumentos());
	}
}
