package br.com.lucasvinas.dao;

import java.util.List;

import br.com.lucasvinas.model.Pessoa;

public interface PessoaDAO {

	public void cadastrar(Pessoa pessoa);
	public List<Pessoa> listaTodas();
	public Pessoa buscar(Pessoa pessoa);
	public void apagar(Pessoa pessoa);
	
}
