package serviço;

import entidade.Cliente;
import entidade.Motorista;
import entidade.Carga;

import java.util.List;

public class CadastroServiço {

	public static Cliente cadastrarCliente(String nome, String endereco, String telefone, String cnpj) {
		return new Cliente(nome, endereco, telefone, cnpj);
	}

	public static Motorista cadastrarMotorista(String nome, String endereco, String telefone, String cnh) {
		return new Motorista(nome, endereco, telefone, cnh);
	}

	public static Carga cadastrarCarga(String tipo, double peso, String origem, String destino, Cliente cliente) {
		return new Carga(tipo, peso, origem, destino, cliente);
	}
}
