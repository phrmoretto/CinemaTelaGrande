package sistema;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        // Criando uma sessão
        Sessao sessao = new Sessao(
                LocalDate.of(2026, 10, 10),
                LocalTime.of(20, 30)
        );

        // Criando um assento
        Assento assento = new Assento("10", 'A');

        // Criando ingresso inteiro
        Ingresso ingressoInteira = new IngressoInteira(
                assento,
                40.00,
                sessao
        );

        System.out.println("=== INGRESSO INTEIRA ===");
        System.out.println("Assento: " + ingressoInteira.getAssento());
        System.out.println("Sessão: " + ingressoInteira.getSessao().getData());
        System.out.println("Horário: " + ingressoInteira.getSessao().getHora());
        System.out.println("Preço: R$ " + ingressoInteira.calcularPreco());

        // Criando ingresso meia
        Ingresso ingressoMeia = new IngressoMeia(
                new Assento("11", 'A'),
                40.00,
                sessao,
                true
        );

        System.out.println();
        System.out.println("=== INGRESSO MEIA ===");
        System.out.println("Assento: " + ingressoMeia.getAssento());
        System.out.println("Preço: R$ " + ingressoMeia.calcularPreco());

        // Criando uma venda
        Venda venda = new Venda(ingressoMeia);

        System.out.println();
        System.out.println("=== VENDA ===");
        System.out.println("Status: " + venda.getStatus());

        venda.reservarIngresso();

        System.out.println("Status: " + venda.getStatus());

        venda.pagarIngresso();

        System.out.println("Status: " + venda.getStatus());

        venda.cancelarIngresso();

        System.out.println("Status: " + venda.getStatus());
    }
}