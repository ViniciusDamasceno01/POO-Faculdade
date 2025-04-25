package entidade;

public class Motorista extends Pessoa {

	private String cnh;
	private String status;

	public Motorista(String nome, String endereco, String telefone, String cnh) {
		super(nome, endereco, telefone); // Chama o construtor da classe Pessoa
		this.cnh = cnh;
		this.status = "Disponível"; // Inicializa o status como "Disponível"
	}

	public String getCnh() {
		return cnh;
	}

	public String getStatus() {
		return status;
	}

	public void iniciarViagem() {
		this.status = "Viagem Iniciada"; // Atualiza o status quando a viagem começa
	}

	@Override
	public void exibirDados() {
		// Exibe os dados do motorista, incluindo o nome herdado da classe Pessoa
		System.out.println("Nome: " + getNome());
		System.out.println("CNH: " + cnh);
		System.out.println("Status: " + status);
		System.out.println("Telefone: " + getTelefone());
	}
}