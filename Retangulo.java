package br.com.unigoias.formas.model;

public class Retangulo {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return lado1 * lado2;
    }
}
