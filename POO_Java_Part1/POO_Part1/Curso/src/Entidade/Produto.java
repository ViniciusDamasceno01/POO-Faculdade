package Entidade;

public class Produto {

	// ATRIBUTOS
	private String nome;
	private double preco;
	private int Quantidade;

	// CONSTRUTOR
    public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		Quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// GET E SET 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	// METODOS

	public double ValorTotalemEstoque() {
		return preco * Quantidade;
	}

	public void AdicionarProdutos(int Quantidade) {
		this.Quantidade += Quantidade;
	}

	public void RemoverProdutos(int Quantidade) {
		this.Quantidade -= Quantidade;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + Quantidade + " unidades" + ", Total: R$ "
				+ String.format("%.2f", ValorTotalemEstoque());
	}
}