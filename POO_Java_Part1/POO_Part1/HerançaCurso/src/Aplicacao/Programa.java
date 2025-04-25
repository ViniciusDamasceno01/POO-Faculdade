package Aplicacao;

import Entidade.Conta;
import Entidade.ContaBusiness;
import Entidade.ContaPoupança;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta acc1 = new Conta(1001, "Maria", 1000);
		acc1.Saque(200);
		System.out.println(acc1.getSaldo());

		Conta acc2 = new ContaPoupança(1002, "Maria", 1000, 0.01);
		acc2.Saque(200);
		System.out.println(acc2.getSaldo());

		Conta acc3 = new ContaBusiness(1001, "Bob", 1000, 500);
		acc3.Saque(200);
		System.out.println(acc3.getSaldo());
	}
}
