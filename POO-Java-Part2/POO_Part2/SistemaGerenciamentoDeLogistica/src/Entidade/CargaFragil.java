package Entidade;

public class CargaFragil extends Carga {

	private double taxaFragilidade;

	public CargaFragil(double peso, String origem, String destino, double taxaFragilidade) {
		super(peso, origem, destino);
		this.taxaFragilidade = taxaFragilidade;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularFrete() {
		double freteBase = getPeso() * 0.5;
		return freteBase + taxaFragilidade;
	}
}
