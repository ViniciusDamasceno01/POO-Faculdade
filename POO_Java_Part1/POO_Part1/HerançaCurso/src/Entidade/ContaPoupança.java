package Entidade;

public class ContaPoupança extends Conta {

	// ATRIBUTOS
	private double taxadejuros;

	public ContaPoupança() {
		super();
	}

	public ContaPoupança(int numeroConta, String titular, double saldo, double taxadejuros) {
		super(numeroConta, titular, saldo);
		this.taxadejuros = taxadejuros;
	}

	public double getTaxadejuros() {
		return taxadejuros;
	}

	public void setTaxadejuros(double taxadejuros) {
		this.taxadejuros = taxadejuros;
	}

	public void SaldoAtualizado() {
		Saldo += Saldo * taxadejuros;
	}

	@Override
	public void Saque(double quantia) {
		Saldo -= quantia;
	}
}