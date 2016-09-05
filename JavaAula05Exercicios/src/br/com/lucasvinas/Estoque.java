package br.com.lucasvinas;

import java.util.List;

public class Estoque {

	private List<Carros> estoqueCarros;
	private List<Motos> estoqueMotos;
	private int capacidadeFisica;
	private int capacidadeAlocada;
	
	public Estoque(int capacidadeFisica) {
		this.capacidadeFisica = capacidadeFisica;
		this.capacidadeAlocada = 0;
	}
	
	public boolean entrarComCarro(Carros carro){
		boolean sucesso = false;
		try{
			if(capacidadeFisica - capacidadeAlocada >= 1){
				estoqueCarros.add(carro);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}
	
	public boolean entrarComCarro(List<Carros> carros){
		boolean sucesso = false;
		try{
			if(capacidadeFisica - capacidadeAlocada >= carros.size()){
				estoqueCarros.addAll(carros);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}	
	
	public boolean entrarComMoto(Motos moto){
		boolean sucesso = false;
		try{
			if(capacidadeFisica - capacidadeAlocada >= 1){
				estoqueMotos.add(moto);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}
	
	public boolean entrarComMoto(List<Motos> motos){
		boolean sucesso = false;
		try{
			if(capacidadeFisica - capacidadeAlocada >= motos.size()){
				estoqueMotos.addAll(motos);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}	
	
	public boolean sairComCarro(Carros carro){
		boolean sucesso = false;
		try{
			if(estoqueCarros.contains(carro)){
				estoqueCarros.remove(carro);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}
	
	public boolean sairComMoto(Motos moto){
		boolean sucesso = false;
		try{
			if(estoqueMotos.contains(moto)){
				estoqueMotos.remove(moto);
				AtualizarEstoque();
				sucesso = true;
			}
		}
		catch(Exception e){
			
		}
		return sucesso;
	}
		
	public int getCapacidadeFisica() {
		return capacidadeFisica;
	}
	public void setCapacidadeFisica(int capacidadeFisica) {
		this.capacidadeFisica = capacidadeFisica;
	}
	public List<Carros> getEstoqueCarros() {
		return estoqueCarros;
	}
	public List<Motos> getEstoqueMotos() {
		return estoqueMotos;
	}
	public int getCapacidadeAlocada() {
		return capacidadeAlocada;
	}






	public int getCapacidadeAtual(){
		AtualizarEstoque();
		return (this.capacidadeFisica - this.capacidadeAlocada);
	}	
	private void AtualizarEstoque(){
		this.capacidadeAlocada = this.estoqueCarros.size() + this.estoqueMotos.size();
	}
	
}
