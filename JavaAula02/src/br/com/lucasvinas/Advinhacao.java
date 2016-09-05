package br.com.lucasvinas;

import java.util.Scanner;

public class Advinhacao {
	public static void main(String[] args) {
		String saida ="Parabens voce acertou {0}! Imbecil";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sem o seu coleguinha vendo entre um numero inteiro: ");
		long numero = Long.parseLong(entrada.nextLine());
		System.out.println("Quantas tentativas no maximo?(Negativo para infinitas)");
		long maximoTentativas = Long.parseLong(entrada.nextLine());
		Boolean acertou = false;
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nSeu amigo babaca pediu para vc acertar o numero dele");
		System.out.println("Digite um numero");
		long chute = Long.parseLong(entrada.nextLine());
		if(numero == chute){
			acertou = true;
			System.out.println(saida.replace("{0}", "de primeira"));
		}
		if(!acertou)
		for(int tentativas = 2; tentativas > 0; tentativas++){
			if(numero < chute){
				System.out.println("Errou!!! Eh menor");				
			}
			if(numero > chute){
				System.out.println("Errou!!! Eh maior");				
			}
			System.out.println("\r\n**Tente Novamente**\r\n");
			chute = Long.parseLong(entrada.nextLine());
			if(numero == chute){
				acertou = true;
				System.out.println(saida.replace("{0}", "em " + tentativas + " tentativas"));	
				tentativas = -1;
			}
			if(tentativas == maximoTentativas && !acertou){
				System.out.println("Errou!!! Voce estourou o maximo de tentativas (" + maximoTentativas + ")");	
				tentativas = -1;
			}
		}
		entrada.close();
		
	}
}
