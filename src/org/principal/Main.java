package org.principal;

import org.model.*;
import java.util.ArrayList;

public class Main {

    // ============================================================
    // MÉTODO AUXILIAR PARA PAGAMENTOS
    // ============================================================
    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        metodo.processarPagamento(valor);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // ============================================================
        // SISTEMA DE FORMAS GEOMÉTRICAS
        // ============================================================
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

        // ============================================================
        // SISTEMA DE PAGAMENTO
        // ============================================================
        System.out.println("\n=== SISTEMA DE PAGAMENTO ===");

        MetodoPagamento cartao = new CartaoCredito("1111 2222 3333 4444", "Yan Silva", "12/28");
        MetodoPagamento boleto = new Boleto("123456789000123456789", "15/11/2025");
        MetodoPagamento pix = new Pix("yan@email.com");

        realizarPagamento(cartao, 250);
        realizarPagamento(boleto, 500);
        realizarPagamento(pix, 100);

        // ============================================================
        // SISTEMA DE NOTIFICAÇÕES
        // ============================================================
        System.out.println("\n=== SISTEMA DE NOTIFICAÇÕES ===");

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new EmailNotificacao("usuario@email.com"));
        notificacoes.add(new SMSNotificacao("+55 11 99999-8888"));
        notificacoes.add(new PushNotificacao("token_dispositivo_123"));

        String mensagem = "Olá! Seu pagamento foi processado com sucesso.";

        for (Notificacao n : notificacoes) {
            n.enviar(mensagem);
        }

        System.out.println("-----------------------------------");

        // ============================================================
        // SISTEMA DE FUNCIONÁRIOS
        // ============================================================
        System.out.println("\n=== SISTEMA DE FUNCIONÁRIOS ===");

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Marcos", "G001", 8000.0, 2000.0));
        funcionarios.add(new Desenvolvedor("Ana", "D001", 5000.0, 3, "Java"));
        funcionarios.add(new Estagiario("Lucas", "E001", 1500.0));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome());
            f.realizarTarefa();
            System.out.println("Salário: R$ " + f.calcularSalario());
            System.out.println("---------------------------------");
        }
    }
}
