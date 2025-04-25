package Programa;

public class Bicicleta extends Veiculo {

	public Bicicleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("A bicicleta " + nome + " esta pedalando");
	}
}
