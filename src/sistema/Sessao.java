package sistema;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao {

    private LocalDate data;
    private LocalTime hora;

    public Sessao(LocalDate data, LocalTime hora) {
        this.data = data;
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean validarAssentoOcupado(Assento assento) {
        // Implementação básica.
        // Posteriormente podemos criar uma lista de assentos ocupados.
        return false;
    }
}