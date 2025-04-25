package Entidade;

public abstract class Carga {

	private double peso;
	private String origem;
	private String destino;

	public Carga(double peso, String origem, String destino) {
		super();
		this.peso = peso;
		this.origem = origem;
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	// Método abstrato para calcular o frete
	public abstract double calcularFrete();

	// Exibir as informações da carga
	public void exibirInfoCarga() {
		System.out.println("Origem: " + origem);
		System.out.println("Destino: " + destino);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Custo do frete: R$ " + calcularFrete());
	}
}
