package Entidades;

public class FuncionarioTerceirizado extends Funcionario {

	private double CustoAdicional;

	// CONTRUTORES
	public FuncionarioTerceirizado() {
	}

	public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorpHora, double bonusAdicional) {
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
	public double Pagamento() {
		return super.Pagamento() + CustoAdicional * 1.1;
	}
}
