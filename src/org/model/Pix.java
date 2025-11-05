package org.model;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento com Pix realizado para a chave: " + chavePix);
            System.out.println("Valor: R$" + valor);
            return true;
        } else {
            System.out.println("Falha no pagamento via Pix. Valor inválido.");
            return false;
        }
    }
}