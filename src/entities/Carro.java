package entities;

public class Carro {
	public String nome;
	public double preco;
	public String marca;
	public String cor;
	public double kilometros;
	public double litros;
	
	public double consumo() {
		return kilometros / litros;
	}
	
	public String getNome() {
		return nome;
	}
}
