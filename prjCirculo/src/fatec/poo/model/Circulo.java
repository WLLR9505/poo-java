/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author WLLR9505
 */
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public double calcArea() {
        return Math.pow(Math.PI * this.raio, 2);
    }
    
    public double calcPerimetro() {
        return 2 * Math.PI * this.raio;
    }
    
    public double calcDiametro() {
        return (2 * this.raio);
    }
}
