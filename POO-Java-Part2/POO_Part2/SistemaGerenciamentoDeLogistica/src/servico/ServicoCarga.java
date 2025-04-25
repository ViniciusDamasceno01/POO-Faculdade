package servico;
import Entidade.Carga;
import Entidade.CargaPesada;

import java.util.ArrayList;

public class ServicoCarga {

	private ArrayList<Carga> cargas;

	public ServicoCarga() {
		cargas = new ArrayList<>();
	}

	// Cadastrar carga
	public void cadastrarCarga(Carga carga) {
		cargas.add(carga);
	}

	// Listar cargas
	public void listarCargas() {
		if (cargas.isEmpty()) {
			System.out.println("Não há cargas cadastradas.");
		} else {
			for (Carga carga : cargas) {
				carga.exibirInfoCarga();
			}
		}
	}

	public void cadastrarCarga(CargaPesada carga) {
		// TODO Auto-generated method stub
		
	}
}
