package Entidade;

public class Conta {

	// ATRIBUTOS
	private int numeroconta;
	private String titular;
	private double saldo;
	
	public Conta() {}
	public Conta(int numeroconta, String titular, double Depositoinicial) {
		this.titular = titular;
		this.numeroconta = numeroconta;
		Deposito(Depositoinicial);
	}

	public Conta(int numeroconta, String titular) {
		this.titular = titular;
		this.numeroconta = numeroconta;
		this.saldo = 0;
	}

	// GET AND SET

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	// METODOS
	public void Deposito(double quantia) {
		saldo += quantia;
	}

	public void Saque(double quantia) {
		saldo -= quantia + 5.0;

	}

	public String toString() {
		return "Conta: " + numeroconta + ", " + "Titular da conta: " + titular + ", " + "Saldo: " + "R$ "
				+ String.format("%.2f", saldo);

	}
}