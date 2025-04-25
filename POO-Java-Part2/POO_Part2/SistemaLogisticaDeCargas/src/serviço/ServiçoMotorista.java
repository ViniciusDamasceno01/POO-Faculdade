package serviço;

import entidade.Motorista;
import entidade.Carga;

public class ServiçoMotorista {

    public static void atribuirCargaMotorista(Carga carga, Motorista motorista) {
        if (carga == null) {
            throw new IllegalArgumentException("Carga inválida.");
        }
        if (motorista == null) {
            throw new IllegalArgumentException("Motorista inválido.");
        }
        carga.atribuirMotorista(motorista);
        System.out.println("Motorista " + motorista.getNome() + " atribuído à carga: " + carga.getTipo());
    }

    public static void iniciarViagem(Carga carga) {
        if (carga == null) {
            throw new IllegalArgumentException("Carga inválida.");
        }
        if (carga.getMotorista() == null) {
            System.out.println("Não é possível iniciar a viagem sem um motorista atribuído.");
            return;
        }
        carga.iniciarViagem();
        System.out.println("Viagem iniciada para a carga: " + carga.getTipo() + 
                           " pelo motorista: " + carga.getMotorista().getNome());
    }
}
