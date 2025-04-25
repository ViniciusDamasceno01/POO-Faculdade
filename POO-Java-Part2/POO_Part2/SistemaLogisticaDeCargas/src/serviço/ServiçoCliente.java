package serviço;

import entidade.Carga;

import java.util.ArrayList;
import java.util.List;

public class ServiçoCliente {

	public static void solicitarFrete(List<Carga> cargas, Carga carga) {
		if (carga == null) {
			throw new IllegalArgumentException("Carga inválida.");
		}
		if (cargas.contains(carga)) {
			throw new IllegalStateException("A carga já está cadastrada.");
		}
		cargas.add(carga);
	}

	public static void visualizarCargas(List<Carga> cargas) {
		if (cargas.isEmpty()) {
			System.out.println("Nenhuma carga disponível.");
			return;
		}
		for (Carga carga : cargas) {
			carga.exibirDados();
			System.out.println("----------------------------");
		}
	}

	public static List<String> obterCargasComoTexto(List<Carga> cargas) {
		List<String> detalhesCargas = new ArrayList<>();
		for (Carga carga : cargas) {
			detalhesCargas.add(carga.toString()); // Requer que `Carga` tenha o método `toString` adequado.
		}
		return detalhesCargas;
	}
}
