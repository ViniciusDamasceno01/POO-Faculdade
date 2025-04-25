package Entidade;

public class CargaPesada extends Carga {

	private double taxaExcessoPeso;

	public CargaPesada(double peso, String origem, String destino, double taxaExcessoPeso) {
		super(peso, origem, destino);
		this.taxaExcessoPeso = taxaExcessoPeso;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularFrete() {
		double freteBase = getPeso() * 0.8;
		return freteBase + taxaExcessoPeso;
	}
}
