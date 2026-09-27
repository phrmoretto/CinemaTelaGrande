package sistema;

public abstract class Ingresso {

    private Assento numero;
    private double preco;
    private Sessao sessao;

    public Ingresso(Assento numero, double preco, Sessao sessao) {
        this.numero = numero;
        this.preco = preco;
        this.sessao = sessao;
    }

    public abstract double calcularPreco();

    public double getPreco() {
        return preco;
    }

    public Assento getAssento() {
        return numero;
    }

    public Sessao getSessao() {
        return sessao;
    }
}