package br.com.lucasvinas;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
	
		nomes.add("Lucas");
		nomes.add("Flavia");
		nomes.add("Arthur");
		
		imprimeLista(nomes);
	
		nomes.add("Julia");

		if(nomes.contains("Julia")){
			System.out.println("Existe o nome Julia na lista na posição " + nomes.indexOf("Julia"));
		}
		else{
			System.out.println("Não existe o nome Julia na lista");
		}	

		System.out.println("Antes de remover: Julia");
		imprimeLista(nomes);
		if(nomes.contains("Julia"))
			nomes.remove(nomes.indexOf("Julia"));
		System.out.println("Depois de remover: Julia");
		imprimeLista(nomes);

		
		
		
	}
	
	public static void imprimeLista(List<String> lista){
		for(String item : lista){
			System.out.println(item);
		}
	}
}
