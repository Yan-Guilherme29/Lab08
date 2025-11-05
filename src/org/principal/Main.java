package org.principal;

import org.model.Circulo;
import org.model.Forma;
import org.model.Quadrado;
import org.model.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cria um ArrayList que armazena objetos do tipo Forma
        ArrayList<Forma> formas = new ArrayList<>();

        // Adiciona diferentes formas ao ArrayList
        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Triangulo(6.0, 3.0));

        // Percorre a lista e chama os métodos polimórficos
        for (Forma f : formas) {
            f.desenhar();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("-----------------------");
        }
    }
}
