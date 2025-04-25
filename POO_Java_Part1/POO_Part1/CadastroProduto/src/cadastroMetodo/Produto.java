package cadastroMetodo;

public class Produto {

	// ATRIBUTOS
	private String nome;
	private double preco;
	private int quantidade;

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
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido!");
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("Quantidade inválida!");
		}
		this.quantidade = quantidade;
	}

	//METODOS
	public void cadastrarProduto(String nome, double preco, int quantidade) {
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidade);
	}

	public void exibirProduto() {
		System.out.println("\nNome: " + getNome());
		System.out.printf("Preço: %.2f\n", getPreco());
		System.out.println("Nome: " + getQuantidade());
	}

	public void atualizarProduto() {


	}
}
