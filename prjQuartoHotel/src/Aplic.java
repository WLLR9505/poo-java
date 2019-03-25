
import java.util.Scanner;
import fatec.poo.model.QuartoHotel;
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
        QuartoHotel quarto;
        quarto = new QuartoHotel(9, 300);
        int op;
        
        while(true) {
        System.out.println("Hotel Recanto do Sossego");
        System.out.println("1 - Consultar Quarto");
        System.out.println("2 - Reservar Quarto");
        System.out.println("3 - Liberar Quarto");
        System.out.println("4 - Consultar Faturamento");
        System.out.println("5 - Sair");
        System.out.println("Digite a opcao:");
        
        op = entrada.nextInt();
        
        switch(op) {
            case 1:
                if (quarto.getSituacao()) {
                System.out.println("Quarto ocupado");
                } else {
                System.out.println("Quarto livre");    
                }
                break;
            case 2:
                if (quarto.getSituacao() == true) {
                    System.out.println("Quarto Ocupado");
                } else {
                    System.out.println("Quarto Livre, Digite seu RG para reservar");
                    quarto.reservar(entrada.nextInt());
                }
                break;
            case 3:
                if (quarto.getSituacao() == false) {
                    System.out.println("Quarto ja esta livre");
                } else {
                    System.out.println("Quantos dias o quarto esteve ocupado?");
                    System.out.println("Valor a ser pago: " + quarto.liberar(entrada.nextInt()));
                }
                break;
            case 4:
                System.out.println("Faturamento: " + quarto.getTotalFaturado());
                break;
            case 5:
                System.exit(0);
                break;
            }
        }
    }
}
