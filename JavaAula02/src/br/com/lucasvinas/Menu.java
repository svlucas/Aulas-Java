package br.com.lucasvinas;

import java.util.Scanner;

public class Menu {
	public static final String CADASTRO_PRODUTO = "1";
	public static final String EMISSAO_NOTA = "2";
	public static final String CANCELAR_COMPRA = "3";
	public static final String EFETUAR_VENDA = "4";
	public static final String SAIR = "5";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao;
		Boolean opcaoValida = false;
		while(!opcaoValida){
			
			System.out.println("Menu Principal");
			System.out.println("1 - Cadastro de Produtos");
			System.out.println("2 - Emitir Nota Fiscal");
			System.out.println("3 - Cancelar Compra");
			System.out.println("4 - Efetuar Venda");
			System.out.println("5 - Sair");
			System.out.println("Entre numero");
			
			opcao = entrada.nextLine();
			
			switch (opcao){
			case CADASTRO_PRODUTO:
				System.out.println("Cadastro de Produtos");
				//opcaoValida = true;
				break;
			case EMISSAO_NOTA:
				System.out.println("Emitir Nota Fiscal");
				//opcaoValida = true;
				break;
			case CANCELAR_COMPRA:
				System.out.println("Cancelar Compra");
				//opcaoValida = true;
				break;
			case EFETUAR_VENDA:
				System.out.println("Efetuar Venda");
				//opcaoValida = true;
				break;
			case SAIR:
				System.out.println("Sair!");
				opcaoValida = true;
				break;
			default:
				System.out.println("\r\n***Tente novamente***\r\n");
				break;			
			}
		}
		entrada.close();
	}
}
