package br.com.lucasvinas.bancorevisao.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.lucasvinas.bancorevisao.excecao.ExcecaoElementoJaExistente;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoElementoNaoExistente;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoLimiteAlcancado;
import br.com.lucasvinas.bancorevisao.model.Conta;

public class ContaDAOLista implements ContaDAO{

	public static int LIMITE_CONTAS = 50;
	public static List<Conta> contas = new ArrayList<>();
	
	@Override
	public void salvar(Conta conta) throws ExcecaoElementoJaExistente, ExcecaoLimiteAlcancado  {
		if(contas.size() >= LIMITE_CONTAS)		{
			throw new ExcecaoLimiteAlcancado("O limite de contas cadastrado já foi alcançado.");
		} 
		else {		
			if(contas.contains(conta)){
				throw new ExcecaoElementoJaExistente("Cliente já cadastrado.");
			} else {
				contas.add(conta);
			}
		}
	}

	@Override
	public void deletar(int numeroConta) throws ExcecaoElementoNaoExistente {

		Conta contaEncontrada = null;
		
		for(Conta conta : contas){
			if(numeroConta == conta.getNumero()){
				contaEncontrada = conta;
			}
		}
		
		if(contaEncontrada != null){
			contas.remove(contaEncontrada);
		}
		else{
			throw new ExcecaoElementoNaoExistente("Não foi encontrada nenhuma conta com esse número para ser removida.");
		}
	}

	@Override
	public List<Conta> buscarTodos() {
		return contas;
	}

	@Override
	public Conta buscarPor(int numeroConta) throws ExcecaoElementoNaoExistente{

		Conta contaEncontrada = null;
		
		for(Conta conta : contas){
			if(numeroConta == conta.getNumero()){
				contaEncontrada = conta;
			}
		}
		
		if(contaEncontrada == null){
			throw new ExcecaoElementoNaoExistente("Não foi encontrada nenhuma conta com esse número.");
		}

		return contaEncontrada;
	}
	

}
