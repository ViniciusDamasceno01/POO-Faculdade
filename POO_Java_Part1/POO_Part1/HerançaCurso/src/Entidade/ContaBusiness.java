package Entidade;

public class ContaBusiness extends Conta {

	// ATRIBUTOS
	private double LimiteEmprestimo;

	// CONSTRUTOR
	public ContaBusiness() {
		super();
	}

	public ContaBusiness(int numeroConta, String titular, double saldo, double limiteEmprestimo) {
		super(numeroConta, titular, saldo);
		LimiteEmprestimo = limiteEmprestimo;
	}

	// GET AND SET
	public double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}

	public void Emprestimo(double quantia) {
		if (quantia <= LimiteEmprestimo) {
			Saldo += quantia - 10;
		}

	}

	// METODOS
	@Override
	public void Saque(double quantia) {
		super.Saque(quantia);
		Saldo -= 2;
	}
}
