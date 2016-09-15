package br.com.lucasvinas.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.lucasvinas.model.Pessoa;

public class PessoaListDAOImpl implements PessoaDAO{

	private List<Pessoa> pessoas;
	
	public PessoaListDAOImpl(){
		this.pessoas = new ArrayList<>();
	}
	
	@Override
	public void cadastrar(Pessoa pessoa) {
		if(!pessoas.contains(pessoa))
			pessoas.add(pessoa);
	}

	@Override
	public List<Pessoa> listaTodas() {
		return pessoas;
	}

	@Override
	public Pessoa buscar(Pessoa pessoa) {
		return pessoas.get(pessoas.indexOf(pessoa));
	}

	@Override
	public void apagar(Pessoa pessoa) {
		if(pessoas.contains(pessoa))
			pessoas.remove(pessoa);
		
	}

	
}
