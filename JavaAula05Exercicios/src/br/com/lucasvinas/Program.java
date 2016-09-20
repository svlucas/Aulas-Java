package br.com.lucasvinas;

import java.util.ArrayList;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		
		Estoque estoqueFisico = new Estoque(50);
		List<Carros> listaDeCarros = new ArrayList<Carros>();
		
		Carros fusca = new Carros(1963, "Azul", 60000, "Fusca", 27500.0, "VM", "0326198457", 1.5);
		Carros monza = new Carros(1988, "Vermelho", 83567, "Monza", 18990.0, "GM", "0134276985", 2.0);		
		Carros corcel = new Carros(1972, "Chumbo", 31227, "Corcel", 12590.0 , "Ford", "4976813205", 1.4);
		
		
		estoqueFisico.entrarComCarro(fusca);
		
		listaDeCarros.add(monza);
		listaDeCarros.add(corcel);
		
		estoqueFisico.entrarComCarro(listaDeCarros);
		
		
		
	}
}
