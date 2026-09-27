package sistema;

public class Assento {

    private String numero;
    private char fileira;

    public Assento(String numero, char fileira) {
        this.numero = numero;
        this.fileira = fileira;
    }

    public String getNumero() {
        return numero;
    }

    public char getFileira() {
        return fileira;
    }

    @Override
    public String toString() {
        return "Assento " + fileira + numero;
    }
}