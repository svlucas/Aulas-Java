package br.com.lucasvinas;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome, por favor, antes que alguem perca a paciencia, infeliz");
		String nomeInfeliz = entrada.nextLine();
		System.out.println("Ola " + nomeInfeliz + "\r\nVoltou? \r\n\r\nRetorica");
		entrada.close();
}
}
