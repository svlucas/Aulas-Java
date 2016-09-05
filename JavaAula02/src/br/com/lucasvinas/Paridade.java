package br.com.lucasvinas;

import java.util.Scanner;

public class Paridade {
	public static void main(String[] args) {
		String paridade;
		String saida = "O numero {0} é {1}";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre um valor inteiro: ");
		long numero = Long.parseLong(entrada.nextLine());
		if(numero%2!=0){
			paridade = "Impar";
		}
		else{
			paridade = "Par";
		}
		System.out.println(saida.replace("{0}", String.valueOf(numero))
				                .replace("{1}", paridade));
		entrada.close();
	}
}
