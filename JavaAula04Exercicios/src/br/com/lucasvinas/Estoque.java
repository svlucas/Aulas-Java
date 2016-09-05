package br.com.lucasvinas;

public class Estoque {

	private String nome;
	private int quantidadeMinima;
	private int quantidadeAtual;
	
	public Estoque(String nome, int quantidadeMinima, int quantidadeAtual){
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidadeAtual = quantidadeAtual;
	}	
	public void mudarNome(String newNome){
		this.nome = newNome;
	}
	public void mudarQuantidadeMinima(int newQuantidadeMinima){
		if(newQuantidadeMinima >= 0)
		this.quantidadeMinima = newQuantidadeMinima;
	}
	public void repor(int quantidade){
		if(quantidade >= 0)
		this.quantidadeAtual += quantidade;
	}
	public void darBaixa(int quantidade){
		if(quantidade >= 0 && quantidade <= this.quantidadeAtual)
		this.quantidadeAtual -= quantidade;
	}
	public String mostra(){
		return "Nome: " + nome + "\r\n"
			 + "Quantidade Mínima: " + quantidadeMinima + "\r\n"
			 + "Quantidade Atual: " + quantidadeAtual +"\r\n";
	}
	public boolean precisaRepor(){
		if(this.quantidadeMinima < this.quantidadeAtual) return false;
		return true;
	}
}
