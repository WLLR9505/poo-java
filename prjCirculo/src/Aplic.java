
import fatec.poo.model.Circulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WLLR9505
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Circulo objCirc;
        
        System.out.println("Digite o raio");
        objCirc = new Circulo(entrada.nextDouble());
        
        System.out.println("Raio: " + objCirc.getRaio());
        System.out.println("Area: " + objCirc.calcArea());
        System.out.println("Perimetro: " + objCirc.calcPerimetro());
        System.out.println("Diametro: " + objCirc.calcDiametro());
        
    }
    
}
