package Programa;

public abstract class Veiculo {

	protected String nome;

	public Veiculo(String nome) {
		super();
		this.nome = nome;
	}

	public abstract void mover();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
