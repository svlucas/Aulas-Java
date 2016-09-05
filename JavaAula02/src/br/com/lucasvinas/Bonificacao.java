package br.com.lucasvinas;

import java.util.Scanner;

public class Bonificacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor entre o nome do funcionario: ");
		String nomeFuncionario = entrada.nextLine();
		System.out.println("Quanto que o infeliz ganha? ");
		float salarioFuncionario = Float.parseFloat(entrada.nextLine());
		System.out.println("Em qual area o babcaca atua? ");
		String areaFuncionario = entrada.nextLine();
		
		if(areaFuncionario.toUpperCase().equals("TECNOLOGIA") 
				|| areaFuncionario.toUpperCase().equals("TI")){
			salarioFuncionario *= 1.1;
		}
		
		String saida = "Infeliz: {0} \r\nSalario: {1}";
		System.out.println(saida.replace("{0}", nomeFuncionario)
								.replace("{1}", String.valueOf(salarioFuncionario)));
		entrada.close();
	}
}
