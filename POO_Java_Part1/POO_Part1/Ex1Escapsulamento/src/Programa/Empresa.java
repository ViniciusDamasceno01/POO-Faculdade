package Programa;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Vinicius");
		funcionario.setSalario(4000.00);

		System.out.println("Nome do funcionario: " + funcionario.getNome());
		System.out.println("Salario do funcionario: " + funcionario.getSalario());
		
		System.out.println("\n");
	
        System.out.println("Tentando definir um nome inválido...");
        funcionario.setNome("Jo");

        System.out.println("\n");
       
        System.out.println("Tentando definir um salário inválido...");
        funcionario.setSalario(-1000.00);
	}
}
