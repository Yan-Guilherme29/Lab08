package org.principal;

import org.model.*;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {


    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        metodo.processarPagamento(valor);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE FORMAS GEOMÉTRICAS ===");


        ArrayList<Forma> formas = new ArrayList<>();


        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Triangulo(6.0, 3.0));


        for (Forma f : formas) {
            f.desenhar();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("-----------------------");
        }

        // ------------------------------------------------------------------------------------------------------------

        System.out.println("\n=== SISTEMA DE PAGAMENTO ===");

        MetodoPagamento cartao = new CartaoCredito("1111 2222 3333 4444", "Yan Silva", "12/28");
        MetodoPagamento boleto = new Boleto("123456789000123456789", "15/11/2025");
        MetodoPagamento pix = new Pix("yan@email.com");

        realizarPagamento(cartao, 250);
        realizarPagamento(boleto, 500);
        realizarPagamento(pix, 100);

        // ------------------------------------------------------------------------------------------------------------

    }
}
