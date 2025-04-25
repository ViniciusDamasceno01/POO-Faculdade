package Entidade;

import servico.ServicoCarga;

public class Motorista extends Usuario {

	public Motorista(String nome, String tipo) {
		super(nome, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void realizarAcao() {
        System.out.println("Ação do Motorista:");
        System.out.println("1. Transportar carga");
        System.out.println("Escolha uma opção:");
    }
	
	// Métodos específicos do motorista
    public void transportarCarga(ServicoCarga servicoCarga) {
        System.out.println("Carga transportada com sucesso!");
    }
}
