package entidade;

public class Carga {

	private String tipo;
	private double peso;
	private String origem;
	private String destino;
	private Cliente cliente;
	private Motorista motorista;
	private boolean viagemIniciada;

	public Carga(String tipo, double peso, String origem, String destino, Cliente cliente) {
		this.tipo = tipo;
		this.peso = peso;
		this.origem = origem;
		this.destino = destino;
		this.cliente = cliente;
		this.motorista = null;
		this.viagemIniciada = false;
	}

	// Método para atribuir um motorista a esta carga
	public void atribuirMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public String getTipo() {
		return tipo;
	}

	public double getPeso() {
		return peso;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public boolean isViagemIniciada() {
		return viagemIniciada;
	}

	public void iniciarViagem() {
		if (motorista != null) {
			this.viagemIniciada = true;
			motorista.iniciarViagem();
			System.out.println("Viagem iniciada para a carga: " + tipo);
		} else {
			System.out.println("Carga não atribuída a nenhum motorista!");
		}
	}

	public void exibirDados() {
		System.out.println("Tipo de Carga: " + tipo);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Origem: " + origem);
		System.out.println("Destino: " + destino);
		System.out.println("Cliente: " + cliente.getNome());
		if (motorista != null) {
			System.out.println("Motorista: " + motorista.getNome());
			System.out.println("Status do Motorista: " + motorista.getStatus());
		} else {
			System.out.println("Motorista não atribuído.");
		}
		System.out.println("Viagem Iniciada: " + (viagemIniciada ? "Sim" : "Não"));
	}
}
