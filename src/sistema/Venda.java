package sistema;

public class Venda {

    private String status;
    private Ingresso ingresso;

    public Venda(Ingresso ingresso) {
        this.ingresso = ingresso;
        this.status = "CRIADA";
    }

    public void reservarIngresso() {

        if (status.equals("CRIADA")) {
            status = "RESERVADO";
            System.out.println("Ingresso reservado com sucesso.");
        } else {
            System.out.println("Nao foi possivel reservar o ingresso.");
        }
    }

    public void pagarIngresso() {

        if (status.equals("RESERVADO")) {
            status = "PAGO";
            System.out.println("Ingresso pago com sucesso.");
        } else {
            System.out.println("O ingresso precisa estar reservado.");
        }
    }

    public void cancelarIngresso() {

        if (status.equals("CANCELADO")) {
            status = "CANCELADO";
            System.out.println("Venda cancelada com sucesso.");
        } else {
            System.out.println("A venda ja esta cancelada.");
        }
    }

    public String getStatus() {
        return status;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }
}