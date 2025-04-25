package entidade;

public class Cliente extends Pessoa {

	private String cnpj;

	public Cliente(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone); // Chama o construtor da classe Pessoa
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public void exibirDados() {
		// Exibe os dados do cliente, incluindo o nome herdado da classe Pessoa
		System.out.println("Nome: " + getNome());
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Telefone: " + getTelefone());
	}
}