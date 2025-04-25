package Programa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto eletronico = new Eletronico("Smartphone", 1000.00, 50);
        Produto vestuario = new Vestuario("Camiseta", 50.00, 100);

        // Exibindo o nome e o preço com desconto dos produtos
        System.out.println("Produto: " + eletronico.getNome());
        System.out.println("Preço original: " + eletronico.getPreco());
        System.out.println("Desconto: " + eletronico.calcularDesconto());
        System.out.println("Preço com desconto: " + (eletronico.getPreco() - eletronico.calcularDesconto()));
        System.out.println();

        System.out.println("Produto: " + vestuario.getNome());
        System.out.println("Preço original: " + vestuario.getPreco());
        System.out.println("Desconto: " + vestuario.calcularDesconto());
        System.out.println("Preço com desconto: " + (vestuario.getPreco() - vestuario.calcularDesconto()));
  
	}

}
