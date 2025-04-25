package Programa;

public class Funcionario {

	private String Nome;
	private double Salario;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.Nome = nome;
		} else {
			System.out.println("Nome inválido! O nome deve ter pelo menos 3 caracteres.");
		}
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.Salario = salario;
		} else {
			System.out.println("Salário inválido! O valor deve ser positivo.");
		}
	}
}
