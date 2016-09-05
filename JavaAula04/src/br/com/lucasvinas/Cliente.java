package br.com.lucasvinas;

import java.util.ArrayList;

public class Cliente {

	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Conta> contas = new ArrayList<Conta>();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Conta getConta(int numero) {
		for (Conta conta : contas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public void abrirConta(int numero, int agencia, double saldo, double limite) {
		Conta conta = new Conta(numero, agencia, this, saldo, limite);
		this.contas.add(conta);
	}

	public void fecharConta(int numero) {
		if (this.getConta(numero) != null) {
			this.contas.remove(this.getConta(numero));
		}
	}
}
