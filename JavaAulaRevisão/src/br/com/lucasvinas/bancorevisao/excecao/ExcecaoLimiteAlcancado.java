package br.com.lucasvinas.bancorevisao.excecao;

public class ExcecaoLimiteAlcancado extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5517460659195863849L;

	public ExcecaoLimiteAlcancado(String mensagem){
		super(mensagem);
	}
}
