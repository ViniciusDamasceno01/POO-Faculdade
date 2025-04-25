package Entidade;

public class Conta {

	//ATRIBUTOS
	private int NumeroConta;
	private String Titular;
	protected double Saldo;

	//CONTRUTORES
    public Conta() {
   }

	public Conta(int numeroConta, String titular, double saldo) {
		NumeroConta = numeroConta;
		Titular = titular;
		Saldo = saldo;
	}

	//GET E SET
	public int getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public double getSaldo() {
		return Saldo;
	}
    
	// METODOS
	public void Saque(double quantia) {
		Saldo -= quantia + 5;
	} 
    public void Deposito(double quantia) {
    	Saldo +=quantia;
    }
}
