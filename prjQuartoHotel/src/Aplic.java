
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
                
        int op, nQ;
        
        while(true) {
        System.out.println("Hotel Recanto do Sossego");
        System.out.println("1 - Consultar Quartos");
        System.out.println("2 - Consultar todos os Quartos");
        System.out.println("3 - Reservar Quarto");
        System.out.println("4 - Liberar Quarto");
        System.out.println("5 - Consultar Faturamento do Hotel");
        System.out.println("6 - Sair");
        System.out.println("Digite a opcao:");
        
        op = entrada.nextInt();
        
        switch(op) {
            case 1:
                System.out.println("Informe o numero do quarto a ser consultado: ");
                nQ = entrada.nextInt();               
                                
                if(pesqQuarto(hotel, nQ) == -1 ){
                    System.out.println("Quarto não cadastrado");
                } else {
                   if(hotel[pesqQuarto(hotel, nQ)].getSituacao()){
                      System.out.println("Quarto Ocupado");
                   }else {
                      System.out.println("Quarto Livre");
                   }
                }
                break;
            case 2:
                for (int i = 0; i < hotel.length; i++) {
                    if (hotel[i].getSituacao()) {
                    System.out.println("Quarto " + hotel[i].getNumQuarto() + " ocupado");
                    } else {
                    System.out.println("Quarto " + hotel[i].getNumQuarto() + " livre");
                    }
                }
                break;
            case 3:
                System.out.println("Informe o numero do quarto a ser consultado: ");
                   nQ= entrada.nextInt();   
                   if(pesqQuarto(hotel, nQ) == -1 ){
                       System.out.println("Quarto não cadastrado");
                   }else
                     if (hotel[pesqQuarto(hotel, nQ)].getSituacao()){
                         System.out.println("Quarto Ocupado");
                     }
                     else{
                       System.out.println("Digite o RG: ");
                       hotel[pesqQuarto(hotel, nQ)].reservar(entrada.nextInt());
                   }  
                break;
            case 4:
                System.out.println("Digite o numero do quarto para liberar");
                int qLiberar = entrada.nextInt();
                
                if(pesqQuarto(hotel, qLiberar) == -1 ){
                         System.out.println("Quarto não cadastrado");
                     }else
                       if (hotel[pesqQuarto(hotel, qLiberar)].getSituacao()){
                           int qtdeDias;
                           System.out.println("Informe a qtde. de dias: ");
                           qtdeDias = entrada.nextInt();
                           System.out.println("Valor da hospedagem: R$ " + hotel[pesqQuarto(hotel, qLiberar)].liberar(qtdeDias));						   
                       }
                       else{
                         System.out.println("Quarto Livre");   
                       }
                break;
            case 5:
                double totalFaturado = 0;
                for (int i = 0; i < hotel.length; i++) {
                    totalFaturado += hotel[i].getTotalFaturado(); //pega o faturamento de cada quarto
                }
                System.out.println("Faturamento: " + totalFaturado);
                break;
            case 6:
                System.exit(0);
                break;
            }
        }
    }
    public static int pesqQuarto(QuartoHotel[] h, int nq){
        int Cont, Resultado = -1;
        
        Cont = 0; 
        while(Cont < h.length && h[Cont].getNumQuarto() != nq){ 
             Cont++;
        }
        if (Cont < h.length)
            Resultado = Cont;
        return(Resultado);
    }
}
