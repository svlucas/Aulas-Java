package br.com.lucasvinas.sistemaautomotivo;

public class CarroMain {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1963;
		fusca.cor = "Azul";
		fusca.marca = "VW";
		fusca.modelo = "Fusca";
		fusca.motor = 1.5;
		fusca.renavam = "0326198457";
		
		
		Carro monza = new Carro();
		monza.ano = 1988;
		monza.cor = "Vermelho";
		monza.marca = "GM";
		monza.modelo =  "Monza";
		monza.motor =  2.0;
		monza.renavam = "0134276985";
		
		Carro corcel = new Carro("Corcel", "Ford", "Chumbo", "4976813205", 1972, 1.4);
		
	
		
		System.out.println(fusca);

		System.out.println(monza);

		System.out.println(corcel);
		//Carro outro = new Carro({ano = 1963})
	}
}
