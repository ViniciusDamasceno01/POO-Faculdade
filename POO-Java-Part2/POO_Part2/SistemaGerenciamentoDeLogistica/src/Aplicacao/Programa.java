package Aplicacao;

import servico.ServicoCarga;
import servico.ServicoUsuario;
import Entidade.*;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		ServicoCarga servicoCarga = new ServicoCarga();
        ServicoUsuario servicoUsuario = new ServicoUsuario();

        // Cadastrando usuários
        Usuario admin = new Administrador("Carlos", "ADM");
        Usuario motorista = new Motorista("João", "MOT.");

        servicoUsuario.cadastrarUsuario(admin);
        servicoUsuario.cadastrarUsuario(motorista);

        while (true) {
            // Menu de opções
            System.out.println("\n1. Gerenciar Usuários");
            System.out.println("2. Gerenciar Cargas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                // Menu de usuários
                servicoUsuario.listarUsuarios();
                System.out.print("Escolha um usuário para realizar ação: ");
                String nomeUsuario = scanner.nextLine();
                Usuario usuarioEscolhido = null;
                for (Usuario usuario : servicoUsuario.usuarios) {
                    if (usuario.getNome().equals(nomeUsuario)) {
                        usuarioEscolhido = usuario;
                        break;
                    }
                }
                if (usuarioEscolhido != null) {
                    usuarioEscolhido.realizarAcao();
                    int acao = scanner.nextInt();
                    if (usuarioEscolhido instanceof Administrador) {
                        if (acao == 1) {
                            // Cadastrar carga
                            cadastrarCarga(servicoCarga, scanner);
                        } else if (acao == 2) {
                            // Listar cargas
                            servicoCarga.listarCargas();
                        }
                    } else if (usuarioEscolhido instanceof Motorista) {
                        if (acao == 1) {
                            // Listar cargas
                            servicoCarga.listarCargas();
                        }
                    }
                }
            } else if (opcao == 2) {
                // Menu de cargas
                System.out.println("Gerenciando Cargas:");
                System.out.println("1. Cadastrar nova carga");
                System.out.println("2. Listar cargas cadastradas");
                System.out.print("Escolha uma opção: ");
                int opcaoCarga = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (opcaoCarga == 1) {
                    // Cadastrar carga
                    cadastrarCarga(servicoCarga, scanner);
                } else if (opcaoCarga == 2) {
                    // Listar cargas
                    servicoCarga.listarCargas();
                }
            } else if (opcao == 3) {
                break;
            }
        }

        scanner.close();
    }

    // Método para cadastrar uma nova carga
    public static void cadastrarCarga(ServicoCarga servicoCarga, Scanner scanner) {
        System.out.print("Digite o tipo da carga (fragil/pesada): ");
        String tipoCarga = scanner.nextLine();

        System.out.print("Digite o peso da carga(KG): ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite a origem da carga(SEM UF): ");
        String origem = scanner.nextLine();

        System.out.print("Digite o destino da carga(SEM UF): ");
        String destino = scanner.nextLine();

        if (tipoCarga.equalsIgnoreCase("fragil")) {
            System.out.print("Digite a taxa de fragilidade: ");
            double taxaFragilidade = scanner.nextDouble();
            Carga cargaFragil = new CargaFragil(peso, origem, destino, taxaFragilidade);
            servicoCarga.cadastrarCarga(cargaFragil);
        } else if (tipoCarga.equalsIgnoreCase("pesada")) {
            System.out.print("Digite a taxa de excesso de peso: ");
            double taxaExcessoPeso = scanner.nextDouble();
            Carga cargaPesada = new CargaPesada(peso, origem, destino, taxaExcessoPeso);
            servicoCarga.cadastrarCarga(cargaPesada);
        } else {
            System.out.println("Tipo de carga inválido!");
        }
    }
}