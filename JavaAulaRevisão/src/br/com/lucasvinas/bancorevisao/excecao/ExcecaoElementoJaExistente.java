package br.com.lucasvinas.bancorevisao.excecao;

public class ExcecaoElementoJaExistente extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6843743444357201890L;

	public ExcecaoElementoJaExistente(String mensagem){
		super(mensagem);
	}
}
