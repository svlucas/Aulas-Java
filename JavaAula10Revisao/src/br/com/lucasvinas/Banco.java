package br.com.lucasvinas;

import java.util.ArrayList;


public class Banco implements Imprimivel{

	ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	
	public boolean inserirConta(ContaBancaria conta){
		boolean sucesso = false;
		try{
			if(!contas.contains(conta)){
				contas.add(conta);
				sucesso = true;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return sucesso;		
	}
	
	public boolean removerConta(ContaBancaria conta){
		boolean sucesso = false;
		try{
			if(contas.contains(conta)){
				contas.add(conta);
				sucesso = true;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return sucesso;		
	}
	
	public ArrayList<ContaBancaria> procurarConta(int numero, Cliente cliente, Gerente gerenteResposavel){
		ArrayList<ContaBancaria> contasPesquisadas = new ArrayList<ContaBancaria>();
		for(ContaBancaria conta : this.contas){
			if(conta.getNumeroConta() == (numero) && !contasPesquisadas.contains(conta)){
				contasPesquisadas.add(conta);
			}
			if(conta.getCliente().equals(cliente) && !contasPesquisadas.contains(conta)){
				contasPesquisadas.add(conta);
			}
			if(conta.getGerenteResponsavel().equals(gerenteResposavel) && !contasPesquisadas.contains(conta)){
				contasPesquisadas.add(conta);
			}
		}
		return contasPesquisadas;
	}

	@Override
	public String mostrarDados() {
		String relatorio = "";
		for(ContaBancaria conta : this.contas){
			relatorio += conta.mostrarDados();
		}
		return relatorio;
	}
	
}
