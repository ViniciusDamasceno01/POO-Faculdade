package Entidade;

import servico.ServicoCarga;

public class Administrador extends Usuario {

	public Administrador(String nome, String tipo) {
		super(nome, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarAcao() {
		System.out.println("Ação do Administrador:");
		System.out.println("1. Cadastrar carga");
		System.out.println("2. Listar cargas");
		System.out.println("Escolha uma opção:");
	}
	
	public void cadastrarCarga(ServicoCarga servicoCarga) {
        System.out.println("Cadastro de Carga realizado.");
        servicoCarga.cadastrarCarga(new CargaPesada(100, "São Paulo", "Rio de Janeiro", 0));
    }
}
