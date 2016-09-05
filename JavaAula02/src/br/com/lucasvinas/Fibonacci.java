package br.com.lucasvinas;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos numeros da sequencia de Fibonacci deseja ver?");
		long quantos = Long.parseLong(entrada.nextLine());
		int penultimo = 1;
		int ultimo = 1;
		int atual;
		if(quantos >= 1){
			System.out.println(penultimo);
		}
		if(quantos >= 2){
			System.out.println(ultimo);
		}
		for(int i = 3; i <= quantos; i++){
			atual = ultimo + penultimo;
			System.out.println(atual);
			penultimo = ultimo;
			ultimo = atual;
		}
		entrada.close();
	}
}
