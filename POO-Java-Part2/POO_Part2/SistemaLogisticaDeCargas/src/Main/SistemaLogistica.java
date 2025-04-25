package Main;

import entidade.*;
import serviço.*;
import java.util.*;

public class SistemaLogistica {

	private static List<Carga> cargas = new ArrayList<>();
	private static List<Motorista> motoristas = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Menu inicial para escolha do tipo de usuário
        while (true) {
            System.out.println("Escolha o tipo de usuário:");
            System.out.println("1. Administrador");
            System.out.println("2. Motorista");
            System.out.println("3. Cliente");
            System.out.println("0. Sair");
            int tipoUsuario = Integer.parseInt(scanner.nextLine());

            switch (tipoUsuario) {
            case 1:
                administrarSistema(scanner);
                break;
            case 2:
                motoristaSistema(scanner);
                break;
            case 3:
                clienteSistema(scanner);
                break;
            case 0:
                System.out.println("Saindo do sistema...");
                return;
            default:
                System.out.println("Opção inválida! Escolha um número entre 0 e 3.");
            }
        }
    }

    // Funções do Administrador
	private static void administrarSistema(Scanner scanner) {
	    while (true) {
	        System.out.println("\nVocê é um Administrador. Escolha uma ação:");
	        System.out.println("1. Cadastrar Carga");
	        System.out.println("2. Visualizar Cargas");
	        System.out.println("3. Cadastrar Motorista");
	        System.out.println("0. Voltar ao menu principal");

	        // Adicionando o trim() para remover espaços extras e capturando exceção caso a entrada não seja válida
	        String entrada = scanner.nextLine().trim();
	        try {
	            int opcao = Integer.parseInt(entrada);

	            switch (opcao) {
	                case 1:
	                    cadastrarCarga(scanner);
	                    break;
	                case 2:
	                    listarCargas(scanner);
	                    break;
	                case 3:
	                    cadastrarMotorista(scanner);
	                    break;
	                case 0:
	                    return; // Volta para o menu principal
	                default:
	                    System.out.println("Opção inválida! Escolha entre 0 e 3.");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Entrada inválida! Por favor, insira um número válido.");
	        }
	    }
	}


    // Função para cadastrar carga
    private static void cadastrarCarga(Scanner scanner) {
        System.out.print("Digite o tipo da carga: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o peso da carga (kg): ");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite o local de origem: ");
        String origem = scanner.nextLine();
        System.out.print("Digite o destino: ");
        String destino = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CNPJ do cliente: ");
        String cnpjCliente = scanner.nextLine();

        Cliente cliente = CadastroServiço.cadastrarCliente(nomeCliente, "Endereco", "Telefone", cnpjCliente);
        Carga carga = CadastroServiço.cadastrarCarga(tipo, peso, origem, destino, cliente);

        cargas.add(carga);
        clientes.add(cliente);

        System.out.println("Carga cadastrada com sucesso!");

        // Pergunta se deseja vincular a carga a um motorista
        System.out.print("Deseja vincular esta carga a um motorista? (S/N): ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
        	vincularMotorista(scanner);
        }
    }

    // Função para listar cargas
    private static void listarCargas(Scanner scanner) {
        if (cargas.isEmpty()) {
            System.out.println("Não há cargas cadastradas.");
        } else {
            System.out.println("Cargas cadastradas:");
            for (int i = 0; i < cargas.size(); i++) {
                Carga carga = cargas.get(i);
                System.out.println("\nCarga " + (i + 1) + ":");
                carga.exibirDados();

                // Pergunta se deseja vincular a carga a um motorista
                System.out.print("Deseja vincular esta carga a um motorista? (S/N): ");
                String opcao = scanner.nextLine();
                if (opcao.equalsIgnoreCase("S")) {
                	vincularMotorista(scanner);
                }
            }
        }
    }

    private static void vincularMotorista(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	// Função para cadastrar motorista
    private static void cadastrarMotorista(Scanner scanner) {
        System.out.print("Digite o nome do motorista: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do motorista: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o endereço do motorista: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o número da CNH do motorista: ");
        String cnh = scanner.nextLine();

        Motorista motorista = CadastroServiço.cadastrarMotorista(nome, cpf, endereco, cnh);
        motoristas.add(motorista);

        System.out.println("Motorista cadastrado com sucesso!");
    }

 // Função para vincular um motorista a uma carga
    private static void vincularMotorista(List<Carga> cargas, List<Motorista> motoristas) {
        if (cargas.isEmpty()) {
            System.out.println("Não há cargas cadastradas!");
            return;
        }
        if (motoristas.isEmpty()) {
            System.out.println("Não há motoristas cadastrados!");
            return;
        }

        // Listar todas as cargas
        System.out.println("Cargas disponíveis:");
        for (int i = 0; i < cargas.size(); i++) {
            Carga carga = cargas.get(i);
            System.out.println(i + 1 + " - " + carga.getTipo() + " (" + (carga.getMotorista() == null ? "Sem motorista" : "Com motorista") + ")");
        }

        // Selecionar uma carga
        System.out.print("Escolha o número da carga: ");
        Scanner scanner = null;
		int escolhaCarga = scanner.nextInt();
        if (escolhaCarga < 1 || escolhaCarga > cargas.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        Carga cargaEscolhida = cargas.get(escolhaCarga - 1);

        // Verificar se já tem motorista
        if (cargaEscolhida.getMotorista() != null) {
            System.out.println("Essa carga já está vinculada ao motorista: " + cargaEscolhida.getMotorista().getNome());
            return;
        }

        // Listar todos os motoristas disponíveis
        System.out.println("Motoristas disponíveis:");
        for (int i = 0; i < motoristas.size(); i++) {
            Motorista motorista = motoristas.get(i);
            if (motorista.getStatus().equals("Disponível")) {
                System.out.println(i + 1 + " - " + motorista.getNome());
            }
        }

        // Selecionar um motorista
        System.out.print("Escolha o número do motorista: ");
        int escolhaMotorista = scanner.nextInt();
        scanner.nextLine(); //
        if (escolhaMotorista < 1 || escolhaMotorista > motoristas.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        Motorista motoristaEscolhido = motoristas.get(escolhaMotorista - 1);

        // Verificar status do motorista
        if (!motoristaEscolhido.getStatus().equals("Disponível")) {
            System.out.println("Esse motorista não está disponível!");
            return;
        }

        // Vincular motorista à carga
        cargaEscolhida.atribuirMotorista(motoristaEscolhido);
        motoristaEscolhido.iniciarViagem(); // Atualiza status do motorista
        System.out.println("Motorista " + motoristaEscolhido.getNome() + " vinculado à carga " + cargaEscolhida.getTipo());
    }



    // Funções do Motorista
    private static void motoristaSistema(Scanner scanner) {
        while (true) {
            System.out.println("Você é um Motorista. Escolha uma ação:");
            System.out.println("1. Iniciar viagem");
            System.out.println("2. Voltar ao menu principal");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
            case 1:
                iniciarViagem(scanner);
                break;
            case 2:
                return; // Voltar ao menu principal
            default:
                System.out.println("Opção inválida! Escolha entre 1 e 2.");
            }
        }
    }

    // Função para iniciar a viagem
    private static void iniciarViagem(Scanner scanner) {
        System.out.print("Digite seu nome: ");
        String nomeMotorista = scanner.nextLine();

        // Buscar o motorista pelo nome
        Motorista motorista = null;
        for (Motorista m : motoristas) {
            if (m.getNome().equalsIgnoreCase(nomeMotorista)) {
                motorista = m;
                break;
            }
        }

        // Verificar se o motorista foi encontrado
        if (motorista == null) {
            System.out.println("Motorista não encontrado. Solicite seu cadastro ao ADM.");
            return;
        }

        // Filtrar as cargas vinculadas ao motorista
        List<Carga> cargasVinculadas = new ArrayList<>();
        for (Carga carga : cargas) {
            if (carga.getMotorista() != null && carga.getMotorista().equals(motorista)) {
                cargasVinculadas.add(carga);
            }
        }

        // Se o motorista não tem cargas vinculadas, informar e retornar
        if (cargasVinculadas.isEmpty()) {
            System.out.println("Nenhuma carga vinculada ao seu nome.");
            return;
        }

        // Exibir as cargas vinculadas ao motorista
        System.out.println("Cargas vinculadas ao seu nome:");
        for (int i = 0; i < cargasVinculadas.size(); i++) {
            Carga carga = cargasVinculadas.get(i);
            System.out.println((i + 1) + ". " + carga.getTipo() + " - " + carga.getOrigem() + " -> " + carga.getDestino());
        }

        // Selecionar a carga para iniciar a viagem
        System.out.print("Selecione a carga para iniciar a viagem (número): ");
        int cargaEscolhida = Integer.parseInt(scanner.nextLine());

        // Verificar se a carga escolhida é válida
        if (cargaEscolhida < 1 || cargaEscolhida > cargasVinculadas.size()) {
            System.out.println("Opção inválida!");
            return;
        }

        // Iniciar a viagem com a carga selecionada
        Carga cargaSelecionada = cargasVinculadas.get(cargaEscolhida - 1);
        System.out.println("Iniciando viagem com a carga:");
        cargaSelecionada.exibirDados();
        cargaSelecionada.iniciarViagem();
        System.out.println("Viagem iniciada com sucesso!");
    }

    // Funções do Cliente
    private static void clienteSistema(Scanner scanner) {
        while (true) {
            System.out.println("Você é um Cliente. Escolha uma ação:");
            System.out.println("1. Acompanhar carga");
            System.out.println("2. Voltar ao menu principal");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
            case 1:
                acompanharCarga(scanner);
                break;
            case 2:
                return; // Voltar ao menu principal
            default:
                System.out.println("Opção inválida! Escolha entre 1 e 2.");
            }
        }
    }

    // Função para acompanhar carga
    private static void acompanharCarga(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Buscar o cliente pelo nome
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nomeCliente)) {
                cliente = c;
                break;
            }
        }

        // Verificar se o cliente foi encontrado
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        // Filtrar as cargas do cliente
        List<Carga> cargasCliente = new ArrayList<>();
        for (Carga carga : cargas) {
            if (carga.getCliente().equals(cliente)) {
                cargasCliente.add(carga);
            }
        }

        // Se não houver cargas para o cliente, informar
        if (cargasCliente.isEmpty()) {
            System.out.println("Você não tem cargas cadastradas.");
            return;
        }

        // Exibir as cargas
        System.out.println("Cargas do cliente " + nomeCliente + ":");
        for (int i = 0; i < cargasCliente.size(); i++) {
            Carga carga = cargasCliente.get(i);
            System.out.println((i + 1) + ". " + carga.getTipo() + " - " + carga.getOrigem() + " -> " + carga.getDestino());
        }

        System.out.println("Acompanhamento concluído!");
    }
}