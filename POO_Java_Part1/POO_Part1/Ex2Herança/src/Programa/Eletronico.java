package Programa;

public class Eletronico extends Produto {

	public Eletronico(String nome, double preco, int estoque) {
		super(nome, preco, estoque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDesconto() {
		return preco * 0.05; // Desconto de 5%
	}

}
