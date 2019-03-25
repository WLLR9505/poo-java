
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
        QuartoHotel[] hotel = new QuartoHotel[10];
        
        System.out.println("Digite o valor da diaria dos quartos");
        double valorDiaria = entrada.nextDouble();
        
        for (int n = 0; n < hotel.length; n++) {
            hotel[n] = new QuartoHotel(n + 1, valorDiaria);
        }       
                
        int op;
        
        while(true) {
        System.out.println("Hotel Recanto do Sossego");
        System.out.println("1 - Consultar Quartos");
        System.out.println("2 - Reservar Quarto");
        System.out.println("3 - Liberar Quarto");
        System.out.println("4 - Consultar Faturamento do Hotel");
        System.out.println("5 - Sair");
        System.out.println("Digite a opcao:");
        
        op = entrada.nextInt();
        
        switch(op) {
            case 1:
                for (int i = 0; i < hotel.length; i++) {
                    if (hotel[i].getSituacao()) {
                    System.out.println("Quarto " + hotel[i].getNumQuarto() + " ocupado");
                    } else {
                    System.out.println("Quarto " + hotel[i].getNumQuarto() + " livre");
                    }
                }
                break;
            case 2:
                int qOcupados = 0; //indica quantos quartos estão ocupados
                for (int i = 0; i < hotel.length; i++) {
                    if (hotel[i].getSituacao() == false) {
                        System.out.println("Quarto " + hotel[i].getNumQuarto() + " Livre, Digite seu RG para reservar");
                        hotel[i].reservar(entrada.nextInt());
                        break;
                    }
                    qOcupados++;
                }
                if (qOcupados == 10) {
                    System.out.println("Todos os quartos estao ocupados");
                }
                break;
            case 3:
                System.out.println("Digite o numero do quarto para liberar");
                int qLiberar = entrada.nextInt();
                
                if (hotel[qLiberar - 1].getSituacao() == false) {
                    System.out.println("Quarto ja esta livre");
                } else {
                    System.out.println("Quantos dias o quarto esteve ocupado?");
                    System.out.println("Valor a ser pago: " + hotel[qLiberar - 1].liberar(entrada.nextInt()));
                }
                break;
            case 4:
                double totalFaturado = 0;
                for (int i = 0; i < hotel.length; i++) {
                    totalFaturado += hotel[i].getTotalFaturado(); //pega o faturamento de cada quarto
                }
                System.out.println("Faturamento: " + totalFaturado);
                break;
            case 5:
                System.exit(0);
                break;
            }
        }
    }
}
