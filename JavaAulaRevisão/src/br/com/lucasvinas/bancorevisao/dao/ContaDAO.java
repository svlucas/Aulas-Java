package br.com.lucasvinas.bancorevisao.dao;

import java.util.List;

import br.com.lucasvinas.bancorevisao.excecao.ExcecaoElementoJaExistente;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoElementoNaoExistente;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoLimiteAlcancado;
import br.com.lucasvinas.bancorevisao.model.Conta;

public interface ContaDAO {

	public void salvar(Conta conta) throws ExcecaoElementoJaExistente, ExcecaoLimiteAlcancado;
	public void deletar(int numeroConta) throws ExcecaoElementoNaoExistente;
	public List<Conta> buscarTodos();
	public Conta buscarPor(int numeroConta) throws ExcecaoElementoNaoExistente;	
	
}
