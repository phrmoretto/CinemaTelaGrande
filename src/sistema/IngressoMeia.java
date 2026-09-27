package sistema;

public class IngressoMeia extends Ingresso {

    private boolean comprovacao;

    public IngressoMeia(Assento numero, double preco, Sessao sessao, boolean comprovacao) {
        super(numero, preco, sessao);
        this.comprovacao = comprovacao;
    }

    public boolean isComprovacao() {
        return comprovacao;
    }

    @Override
    public double calcularPreco() {
        if (comprovacao) {
            return getPreco() / 2;
        } else {
            return getPreco();
        }
    }
}