package br.com.lucasvinas;

public class Veiculos {

	private int ano;
	private String cor;
	private int km;
	private String modelo;
	private double valor;
	private String fabricante;
	private String licen�a;
	
	public Veiculos(int ano, String cor, int km, String modelo, double valor, String fabricante, String licen�a) {
		this.ano = ano;
		this.cor = cor;
		this.km = km;
		this.modelo = modelo;
		this.valor = valor;
		this.fabricante = fabricante;
		this.licen�a = licen�a;
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
	public String getLicen�a() {
		return licen�a;
	}
	public void setLicen�a(String licen�a) {
		this.licen�a = licen�a;
	}	
}
