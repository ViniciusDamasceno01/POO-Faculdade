package Executavel;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Conta;

public class Progama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta = null;

		while (1 == 1) {

			System.out.println("[1] = Criar conta.");
			System.out.println("[2] = Depositar.");
			System.out.println("[3] = Saca.");
			System.out.println("[4] = Mostrar Saldo");

			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.print("Insira o número da sua conta: ");
				int numeroconta = sc.nextInt();
				System.out.print("Insira o titular da sua conta: ");
				sc.nextLine();
				String titular = sc.nextLine();
				System.out.print("Deseja efetuar um deposito inicial (S/N)? ");
				char resposta = sc.next().toUpperCase().charAt(0);
				if (resposta == 'S') {

					System.out.print("Insira o valor do depósito inicial: ");
					double Depositoinicial = sc.nextDouble();
					conta = new Conta(numeroconta, titular, Depositoinicial);

				}

				else {
					conta = new Conta(numeroconta, titular);
				}
				break;
			case 2:

				System.out.println();
				System.out.print("Insira um valor de deposito: ");
				double ValorDeposito = sc.nextDouble();
				conta.Deposito(ValorDeposito);
				System.out.println("Dados da conta atualizados: ");
				System.out.println(conta);

				break;
			case 3:
				System.out.println();
				System.out.print("Insira um valor para sacar: ");
				double ValorSaque = sc.nextDouble();

				break;
			case 4:
				System.out.println();
				System.out.println("Dados da conta: ");
				System.out.println(conta);

				break;
			default:
				System.out.println("Digite um numero valido seu demonio!!");

				break;

			}

		}
	}
}