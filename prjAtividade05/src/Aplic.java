
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;

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
        PessoaFisica pf = new PessoaFisica("55599955500","Weuller",  2010);
        pf.setBase(75);
        pf.addCompras(3500);
        pf.addCompras(6000);
        pf.addCompras(7500);
       
        System.out.println(pf.getNome() + " Bonus: " + pf.calcBonus(2019));
        System.out.println("Total de Compras: " + pf.getTotalCompras());
        
        PessoaJuridica pj = new PessoaJuridica("55599955500", "Junior", 2013);
        pj.setTaxaIncentivo(1.20);
        pj.addCompras(3000);
        pj.addCompras(5000);
        pj.addCompras(7350);
        System.out.println(pj.getNome() + " Bonus: " + pj.calcBonus(2019));
        System.out.println("Total de Compras: " + pj.getTotalCompras());
    }
    
}
