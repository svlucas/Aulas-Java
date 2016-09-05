package br.com.lucasvinas.fazenda;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

	public static void main(String[] args) {
		Vaca mimosa = new Vaca("Mimosa", 26);
		Cachorro dog = new Cachorro("Dog", 2, true);		
		Animal rex = new Cachorro("Rex", 15, false);		
		Animal animal = new Animal("Pluto", 40);
		List<Animal> animais = new ArrayList<Animal>();
		
		animais.add(mimosa);
		animais.add(dog);
		animais.add(rex);
		animais.add(animal);
		
		
		for(Animal ani : animais){
			if(ani instanceof Cachorro){
				ani.emitirSom();
			}
		}
		
		mimosa.emitirSom();
		dog.emitirSom();
		rex.emitirSom();
		animal.emitirSom();
		
	}
}
