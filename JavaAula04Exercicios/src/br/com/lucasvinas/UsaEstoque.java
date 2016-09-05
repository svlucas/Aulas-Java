package br.com.lucasvinas;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Estoque 1", 10, 10);
		Estoque estoque2 = new Estoque("Estoque 2", 10, 20);
		Estoque estoque3 = new Estoque("Estoque 3",  0,  5);
		
		estoque1.darBaixa(5);
		estoque2.repor(10);
		estoque3.darBaixa(4);
		System.out.println("Precisa repor Estoque 1? " + estoque1.precisaRepor());
		System.out.println("Precisa repor Estoque 2? " + estoque2.precisaRepor());
		System.out.println("Precisa repor Estoque 3? " + estoque3.precisaRepor());
		System.out.println("Situação");
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
	}
}
