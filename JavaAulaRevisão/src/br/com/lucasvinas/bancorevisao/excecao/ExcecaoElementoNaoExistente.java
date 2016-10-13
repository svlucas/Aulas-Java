package br.com.lucasvinas.bancorevisao.excecao;

public class ExcecaoElementoNaoExistente  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3117037395873922974L;

	public ExcecaoElementoNaoExistente(String mensagem){
		super(mensagem);
	}
}
