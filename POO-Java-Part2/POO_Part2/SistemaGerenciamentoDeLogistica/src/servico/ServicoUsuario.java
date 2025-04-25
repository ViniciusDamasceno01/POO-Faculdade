package servico;

import Entidade.Usuario;
import java.util.ArrayList;

public class ServicoUsuario {

	public static Usuario[] Usuario;
	public ArrayList<Usuario> usuarios;
	public Usuario[] usuario;

	public ServicoUsuario() {
		usuarios = new ArrayList<>();
	}

	// Cadastrar usuário
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	// Listar usuários
	public void listarUsuarios() {
		if (usuarios.isEmpty()) {
			System.out.println("Não há usuários cadastrados.");
		} else {
			for (Usuario usuario : usuarios) {
				System.out.println("Nome: " + usuario.getNome() + " | Tipo: " + usuario.getTipo());
			}
		}
	}
}
