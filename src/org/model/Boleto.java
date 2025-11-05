package org.model;

public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;

    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento com boleto gerado.");
            System.out.println("Código de barras: " + codigoBarra);
            System.out.println("Pague até: " + dataVencimento + " | Valor: R$" + valor);
            return true;
        } else {
            System.out.println("Falha ao gerar boleto. Valor inválido.");
            return false;
        }
    }
}