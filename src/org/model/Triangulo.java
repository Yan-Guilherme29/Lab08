package org.model;

public class Triangulo extends Forma{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (base * altura) / 2;

    }

    @Override
    public void desenhar() {

        System.out.println("Desenhando Triângulo com Base: " + base + " E Altura: " + altura);


    }
}
