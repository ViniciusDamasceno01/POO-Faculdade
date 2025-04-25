package Programa;

public class Carro extends Veiculo {

	public Carro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("O carro " + nome + " está dirigindo.");
	}
}
