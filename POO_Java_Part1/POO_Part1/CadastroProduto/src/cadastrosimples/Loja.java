package cadastrosimples;

public class Loja {
	public static void main(String[] args) {

		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		p1.setNome("Celular");
		p1.setPreco(1900.00);
		p1.setQuantidade(2);
		
		p2.setNome("Notebook");
		p2.setPreco(4000);
		p2.setQuantidade(3);
		
		System.out.println("*******Produto 1********");
		System.out.println("Nome: " + p1.getNome());
		System.out.printf("Preço: %.2f\n", p1.getPreco());
		//System.out.println("Preço: " + p1.getPreco());
		System.out.println("Quantidade: " + p1.getQuantidade() + "\n");
		
		System.out.println("*******Produto 2********");
		System.out.println("Nome: " + p2.getNome());
		System.out.printf("Preço: %.2f\n", p2.getPreco());
		//System.out.println("Preço: " + p2.getPreco());
		System.out.println("Quantidade: " + p2.getQuantidade());
	}
}
