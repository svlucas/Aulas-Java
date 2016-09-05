package br.com.lucasvinas;

public class TesteConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setId(1);
		cliente.setNome("Lucas");
		cliente.setEndereco("Aquele ali");
		
		cliente.abrirConta(1, 123, 784.0, 1000.0);
		cliente.abrirConta(2, 123, 200.0, 5000.0);
		
		cliente.getConta(1).imprimeExtrato();
		cliente.getConta(2).imprimeExtrato();
		
		cliente.getConta(1).tranferencia(cliente.getConta(2), 150);		

		cliente.getConta(1).imprimeExtrato();
		cliente.getConta(2).imprimeExtrato();
		
		cliente.fecharConta(1);
		if(cliente.getConta(1) != null){
			cliente.getConta(1).imprimeExtrato();
		}
		//cliente.getConta(3).imprimirTitular();
		
		/*Conta bradesco = new Conta(1,123, cliente, 784.0,1000.0);
		Conta santander = new Conta(2, 123, cliente, 200.0, 5000.0);

		bradesco.imprimeExtrato();
		santander.imprimeExtrato();
		
		bradesco.tranferencia(santander, 200);

		bradesco.imprimeExtrato();
		santander.imprimeExtrato();*/

	}
}
