package br.com.lucasvinas;

public class TesteFuncionario {

	public static void main(String[] args) {
		Engenheiro ender = new Engenheiro();
		ender.setNome("Astolfo");
		ender.setSalario(5000.00);
		
		Gerente gabriel = new Gerente();
		gabriel.setNome("Adalberto");
		gabriel.setSalario(3000.00);
		
		Vendedor vander = new Vendedor();
		vander.setNome("Rubens");
		vander.setSalario(4000.00);
		
		Funcionario fabio = new Engenheiro();
		fabio.setNome("Tiago");
		fabio.setSalario(4500.0);
		
		System.out.println(ender.getNome() + " recebe: " +  ender.getSalario());
		System.out.println(gabriel.getNome() + " recebe: " +  gabriel.getSalario());
		System.out.println(vander.getNome() + " recebe: " +  vander.getSalario());
		System.out.println(fabio.getNome() + " recebe: " +  fabio.getSalario());
		
		
		
	}
}
