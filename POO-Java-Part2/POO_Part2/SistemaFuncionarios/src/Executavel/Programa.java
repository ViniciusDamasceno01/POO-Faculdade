package Executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidade.FuncionariosProprios;
import Entidade.FuncionariosTerceirizados;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FuncionariosProprios> list = new ArrayList<>();

		System.out.println("Insira o número de funcionarios que deseja verificar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionário #" + i + " dados:");
			System.out.print("Terceirizado: (s/n) ?");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int HorasTrabalhadas = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double ValorpHora = sc.nextDouble();

			if (resposta == 's') {
				System.out.print("Custos adicionais: ");
				double CustosAdicionais = sc.nextDouble();
				FuncionariosProprios func = new FuncionariosTerceirizados(nome, HorasTrabalhadas, ValorpHora,
						CustosAdicionais);
				list.add(func);
			} else {
				FuncionariosProprios func = new FuncionariosProprios(nome, HorasTrabalhadas, ValorpHora);
				list.add(func);
			}

			System.out.println();
			System.out.println("PAGAMENTOS: ");
			for (FuncionariosProprios func : list) {
				System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));

			}

		}

	}
}