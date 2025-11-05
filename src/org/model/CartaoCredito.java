package org.model;

import java.util.Date;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento com cartão de crédito processado.");
            System.out.println("Titular: " + nomeTitular + " | Valor: R$" + valor);
            return true;
        } else {
            System.out.println("Falha no pagamento com cartão de crédito. Valor inválido.");
            return false;
        }
    }
}