package br.com.lucasvinas;

public class Veiculos {

	private int ano;
	private String cor;
	private int km;
	private String modelo;
	private double valor;
	private String fabricante;
	private String licença;
	
	public Veiculos(int ano, String cor, int km, String modelo, double valor, String fabricante, String licença) {
		this.ano = ano;
		this.cor = cor;
		this.km = km;
		this.modelo = modelo;
		this.valor = valor;
		this.fabricante = fabricante;
		this.licença = licença;
	}
	
	public int getAno() {
		return ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getModelo() {
		return modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor >= 0)
		this.valor = valor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public String getLicença() {
		return licença;
	}
	public void setLicença(String licença) {
		this.licença = licença;
	}	
}
