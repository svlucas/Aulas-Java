package br.com.lucasvinas;

public interface Fax {

	public void enviar(String texto, String numeroDestino);
	public String receber(String numeroOrigem);
}
