package br.com.lucasvinas;

import java.util.Collections;
import java.util.List;

import br.com.lucasvinas.dao.PessoaDAO;
import br.com.lucasvinas.dao.PessoaListDAOImpl;
import br.com.lucasvinas.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
	
	Pessoa assassino = new Pessoa(1, "Okimataro Atiro", "okimataroatiro@gmail.com", "11688133213");
	Pessoa rico = new Pessoa(2, "Takanota Nakasaka", "takanotanakasaka@gmail.com", "135461324168");
	Pessoa acidentado = new Pessoa(3, "Massaro Miamoto", "massaromiamoto@gmail.com", "4543186431");
	
	PessoaDAO dao = new PessoaListDAOImpl();

	dao.cadastrar(acidentado);
	dao.cadastrar(assassino);
	dao.cadastrar(rico);
	imprimeLista(dao.listaTodas());
	
	//dao.apagar(assassino);
	imprimeLista(dao.listaTodas());
	
	
	List<Pessoa> pessoas = dao.listaTodas();
	
	imprimeLista(pessoas);
	
	Collections.sort(pessoas);

	imprimeLista(pessoas);
	
	
	}
	
	public static void imprimeLista(List<Pessoa> lista){
		for(Pessoa item : lista){
			System.out.println(item);
		}
		System.out.println();
	}
	
}
