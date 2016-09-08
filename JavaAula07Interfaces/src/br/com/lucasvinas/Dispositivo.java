package br.com.lucasvinas;

public class Dispositivo {

	private String marca;
	private String modelo;
	private String cor;
	private long numeroSerie;
	
	
	
	public Dispositivo(String marca, String modelo, String cor, long numeroSerie) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.numeroSerie = numeroSerie;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public long getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
}
