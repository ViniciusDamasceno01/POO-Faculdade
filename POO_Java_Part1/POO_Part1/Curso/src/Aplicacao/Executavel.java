package Aplicacao;

import java.util.Scanner;

import Entidade.Triangulo;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			Triangulo x, y;
			x = new Triangulo();
			y = new Triangulo();

			System.out.println("Digite os lados do triangulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Digite os lados do triangulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();

			double areaX = x.area();
			double areaY = y.area();

			System.out.printf("A area do do triangulo X é igual a: %.4f%n", areaX);
			System.out.printf("A area do do triangulo Y é igual a: %.4f%n", areaY);
		}
	}
}
