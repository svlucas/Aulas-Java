package br.com.lucasvinas;

public class SuperPrinter extends Dispositivo implements MultiFuncional {

	public SuperPrinter(String marca, String modelo, String cor, long numeroSerie) {
		super(marca, modelo, cor, numeroSerie);
	}

	@Override
	public String digitalizarDocumentos() {
		return "Imagem Digitalizada";
	}

	@Override
	public void enviar(String texto, String numeroDestino) {
		System.out.println("Enviando fax para:" + numeroDestino);
		System.out.println(texto);
	}

	@Override
	public String receber(String numeroOrigem) {
		System.out.println("Recebendo faz de:" + numeroOrigem);
		return "Texto muito louco recebido";
	}

	@Override
	public void imprimirDocumentos(String dados, int quantidade) {
		for(int i= 1; i <= quantidade; i++){
			System.out.println("Imprimindo documento nº" + i + " de " + quantidade);
			System.out.println(dados);
		}		
	}

	@Override
	public void copiarDocumento(String dados, int quantidade) {
		for(int i= 1; i <= quantidade; i++){
			System.out.println("Copiando documento nº" + i + " de " + quantidade);
			System.out.println(dados);
		}
	}

	
}
