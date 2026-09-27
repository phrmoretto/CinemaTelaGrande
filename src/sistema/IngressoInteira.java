package sistema;

public class IngressoInteira extends Ingresso {

    public IngressoInteira(Assento numero, double preco, Sessao sessao) {
        super(numero, preco, sessao);
    }

    @Override
    public double calcularPreco() {
        return getPreco();
    }
}