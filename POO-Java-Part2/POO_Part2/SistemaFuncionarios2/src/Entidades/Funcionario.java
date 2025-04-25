package Entidades;

public class Funcionario {

	// ATRIBUTOS
	private String Nome;
	private int HorasTrabalhadas;
	private double ValorpHora;

	// CONSTRUTOR

	public Funcionario() {
	}

	public Funcionario(String nome, int horasTrabalhadas, double valorpHora) {
		Nome = nome;
		HorasTrabalhadas = horasTrabalhadas;
		ValorpHora = valorpHora;
	}

	// GET AND SETT

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}

	public double getValorpHora() {
		return ValorpHora;
	}

	public void setValorpHora(double valorpHora) {
		ValorpHora = valorpHora;
	}

	// METODOS
	public double Pagamento() {
		return HorasTrabalhadas * ValorpHora;
	}
}
