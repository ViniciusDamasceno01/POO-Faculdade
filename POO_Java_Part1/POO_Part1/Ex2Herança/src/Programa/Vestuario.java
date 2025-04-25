package Programa;

public class Vestuario extends Produto {

	public Vestuario(String nome, double preco, int estoque) {
		super(nome, preco, estoque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDesconto() {
		return preco * 0.10; // Desconto de 10%
	}
}
