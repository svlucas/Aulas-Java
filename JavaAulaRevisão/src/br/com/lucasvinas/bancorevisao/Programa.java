package br.com.lucasvinas.bancorevisao;

import java.util.Random;
import java.util.Scanner;

import br.com.lucasvinas.bancorevisao.dao.ContaDAO;
import br.com.lucasvinas.bancorevisao.dao.ContaDAOLista;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoElementoJaExistente;
import br.com.lucasvinas.bancorevisao.excecao.ExcecaoLimiteAlcancado;
import br.com.lucasvinas.bancorevisao.model.Cliente;
import br.com.lucasvinas.bancorevisao.model.Conta;

public class Programa {

	private static final int SAIR = 0;
	private static final int CADASTRAR = 1;
	private static final int  APAGAR = 2;
	private static final int  LISTAR_TODAS = 3;
	private static final int PESQUISAR_POR_NUMERO = 4;
	private static Scanner entrada;
	private static ContaDAO dao;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int op = 0;
		dao = new ContaDAOLista();
		do{
			System.out.println("*******************");
			System.out.println("*  Banco Infeliz  *");
			System.out.println("*******************");

			System.out.println("1 - Cadastrar");
			System.out.println("2 - Apagar");
			System.out.println("3 - Listar todas as Contas");
			System.out.println("4 - Pesquisar por numero de conta");
			System.out.println("0 - Sair");
			
			System.out.println("Digite o numero da opcao desejada: ");
			
			try{
				op = Integer.parseInt(entrada.nextLine());
				
				switch (op){
				case CADASTRAR:
					cadastrar();
					break;
				case APAGAR:
					break;
				case LISTAR_TODAS:
					break;
				case PESQUISAR_POR_NUMERO:
					break;
				case SAIR:
					System.out.println("Finalizando");
					break;
				default:
					System.out.println("Digite um numero dentro das opções imbecil.");
					break;
				}
				
				
			}
			catch (NumberFormatException nfe){
				System.out.println("Digite um numero sua anta.");
				op = -1;
			}
			
		} while(op != 0);

		System.out.println("Sistema Encerrado");
	}
	
	
	private static void cadastrar(){
		Cliente cliente = new Cliente();
		System.out.println("Informe o nome do cliente:");
		cliente.setNome(entrada.nextLine());
		System.out.println("Informe o CPF do cliente:");
		cliente.setCpf(entrada.nextLine());
		
		try{
			dao.salvar(new Conta(new Random().nextInt(), 100.00, cliente));
		}
		catch(ExcecaoElementoJaExistente | ExcecaoLimiteAlcancado e){
			e.printStackTrace();
		}
	}
	
}
