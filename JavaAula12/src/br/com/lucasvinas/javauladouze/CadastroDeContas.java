package br.com.lucasvinas.javauladouze;

import java.util.ArrayList;

import br.com.lucasvinas.javauladouze.exception.ExcecaoDadoInvalido;
import br.com.lucasvinas.javauladouze.exception.ExcecaoElementoJaExistente;
import br.com.lucasvinas.javauladouze.exception.ExcecaoElementoInexistente;
import br.com.lucasvinas.javauladouze.exception.ExcecaoRepositorio;

public class CadastroDeContas {

	ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
	
	public boolean inserirConta(ContaBancaria conta) throws ExcecaoDadoInvalido, ExcecaoElementoJaExistente, ExcecaoRepositorio{
		boolean sucesso = false;
		if(!listaContas.contains(conta)){
			listaContas.add(conta);
			sucesso = true;
		}
		else{
			throw new ExcecaoElementoJaExistente("Conta já existe");
		}
		
		return sucesso;		
	}
	public boolean removerConta(ContaBancaria conta) throws ExcecaoElementoInexistente, ExcecaoDadoInvalido{
		boolean sucesso = false;
		if(listaContas.contains(conta)){
			listaContas.add(conta);
			sucesso = true;
		}
		else{
			throw new ExcecaoElementoInexistente("Não encontrada");
		}
		
		return sucesso;		
	}
	
	public ArrayList<ContaBancaria> procurarConta(int numero, Cliente cliente) throws ExcecaoDadoInvalido{
		ArrayList<ContaBancaria> contasPesquisadas = new ArrayList<ContaBancaria>();
		for(ContaBancaria conta : this.listaContas){
			if(conta.getNumeroConta() == (numero) && !contasPesquisadas.contains(conta)){
				contasPesquisadas.add(conta);
			}
			if(conta.getCliente().equals(cliente) && !contasPesquisadas.contains(conta)){
				contasPesquisadas.add(conta);
			}
		}
		if(contasPesquisadas.size() < 1){
			throw new ExcecaoDadoInvalido ("Não encontrada");
		}
		return contasPesquisadas;
	}
}
