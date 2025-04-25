package ExercicioExemplo;

import java.util.Scanner;
import Entidade.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int Quantidade = sc.nextInt();

		Produto produto = new Produto(nome, preco, Quantidade);

		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.print("Insira a quantidade de produtos a serem adicionados em estoque:");
		Quantidade = sc.nextInt();
		produto.AdicionarProdutos(Quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		System.out.println();
		System.out.print("Insira a quantidade de produtos a serem retirados do estoque:");
		Quantidade = sc.nextInt();
		produto.RemoverProdutos(Quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

	}
}
