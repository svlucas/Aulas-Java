package br.com.lucasvinas;

public class LivroFisico extends Livro {

	double valorFrete;

	public LivroFisico(String nome, String descricao, double valor, String isbn, Autor autor, double valorFrete) {
		super(nome, descricao, valor, isbn, autor);
		this.valorFrete = valorFrete;
	}
	
	
	
	public LivroFisico(String nome, String descricao, double valor, String isbn, Autor autor) {
		super(nome, descricao, valor, isbn, autor);
		this.valorFrete = 0.0;
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean aplicarDescontoDe(double porcentagem){
		boolean sucesso = false;
		if(porcentagem <= 30){
			this.setValor(getValor() * (100 - porcentagem) / 100); 
			sucesso = true;
		}
		return sucesso;
	}
}
