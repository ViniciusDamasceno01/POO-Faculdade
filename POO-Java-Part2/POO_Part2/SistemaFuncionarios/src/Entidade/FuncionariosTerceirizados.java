package Entidade;

public class FuncionariosTerceirizados extends FuncionariosProprios {

	private double CustoAdicional;

	// CONTRUTORES
	public FuncionariosTerceirizados() {
	}

	public FuncionariosTerceirizados(String nome, int horasTrabalhadas, double valorpHora, double bonusAdicional) {
		super(nome, horasTrabalhadas, valorpHora);
		this.CustoAdicional = bonusAdicional;
	}

	public double getCustoAdicional() {
		return CustoAdicional;
	}

	public void setCustoAdicional(double custoAdicional) {
		CustoAdicional = custoAdicional;
	}

	// METODOS
	@Override
	public double pagamento() {
		return super.pagamento() + CustoAdicional * 1.1;
	}
}
