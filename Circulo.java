package br.com.unigoias.formas.model;

public class Circulo {


   

    private double raio;

    public Circulo(){

    }

   

    public Circulo(double base) {
        this.raio = base;
    }

    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double base) {
        this.raio = base;
    }
 

    


    public double getAreaCirculo() {
        return 3.14 * (raio*raio);

    }


    

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", π=" + 3.14 + ", getAreaCirculo()=" + getAreaCirculo() + "]";
    }


}