
import fatec.poo.model.Aluno;
import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("0.00");
        Aluno Weuller;
        Weuller = new Aluno();
        
        System.out.println("Digite o RA[...]");
        Weuller.setRa(entrada.nextInt());
        System.out.println("Digite a nota da prova 1[...]");
        Weuller.setNtPrv1(entrada.nextDouble());
        System.out.println("Digite a nota da prova 2[...]");
        Weuller.setNtPrv2(entrada.nextDouble());
        System.out.println("Digite a nota do trabalho 1[...]");
        Weuller.setNtTrab1(entrada.nextDouble());
        System.out.println("Digite a nota do trabalho 2[...]");
        Weuller.setNtTrab2(entrada.nextDouble());
        
        System.out.println("---------------------");
        System.out.println("RA:");
        System.out.println(Weuller.getRa());
        System.out.println("Nota Prova 1:");
        System.out.println(Weuller.getNtPrv1());
        System.out.println("Nota Prova 2:");
        System.out.println(Weuller.getNtPrv2());
        System.out.println("Nota Trabalho 1:");
        System.out.println(Weuller.getNtTrab1());
        System.out.println("Nota Trabalho 2:");
        System.out.println(Weuller.getNtTrab2());
        System.out.println("Media das Provas:");
        System.out.println(df.format(Weuller.calcMediaProva()));
        System.out.println("Media dos Trabalhos:");
        System.out.println(df.format(Weuller.calcMediaTrab()));
        System.out.println("Media Final:");
        System.out.println(df.format(Weuller.calcMediaFinal()));
        
        System.out.println("SITUACAO:");
        
        if (Weuller.isAprovado() == true) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    
}
