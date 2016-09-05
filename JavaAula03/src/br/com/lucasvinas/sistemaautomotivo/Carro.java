package br.com.lucasvinas.sistemaautomotivo;

public class Carro {

	int ano;
	String cor;
	String marca;
	double motor;
	String modelo;
	String renavam;
	
	public Carro(){
		
	}
	
	public Carro(String modelo, String marca, String cor, String renavam, int ano, double motor){
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.renavam = renavam;
		this.ano = ano;
		this.motor = motor;
	}
	
	
	@Override
	public String toString(){
		return "Modelo: " + this.modelo + "\n"
			 + "Marca: " + this.marca + "\n"
			 + "Cor: " + this.cor + "\n"
			 + "Renavam: " + this.renavam + "\n";
	}
}
