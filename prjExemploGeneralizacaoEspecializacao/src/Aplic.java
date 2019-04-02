
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
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
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80); 
        funcHor.setCargo("Programador");
        funcHor.apontarHoras(90);
        System.out.println(funcHor.getNome());
        System.out.println(funcHor.getRegistro());
        System.out.println(funcHor.getDtAdmissao());
        System.out.println(funcHor.getCargo());
        
        System.out.println("Salario Bruto    =>  " +  funcHor.calcSalBruto());
        System.out.println("Desconto          =>  " +  funcHor.calcDesconto());
        System.out.println("Salario Liquido  =>  " + funcHor.calcSalLiquido());
        System.out.println("Gratificacao    =>  " + funcHor.calcGratificacao());
           
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1011, "Leandro Alves", "15/12/19790", 2.5);
        funcMen.setCargo("Aux. Administrativo");
        funcMen.apontarValSalMin(998);
        System.out.println(funcMen.getNome());
        System.out.println(funcMen.getRegistro());
        System.out.println(funcMen.getDtAdmissao());
        System.out.println(funcMen.getCargo());
        
        System.out.println("Salario Bruto    =>  " +  funcMen.calcSalBruto());
        System.out.println("Desconto          =>  " +  funcMen.calcDesconto());
        System.out.println("Salario Liquido  =>  " + funcMen.calcSalLiquido());
          
        
       FuncionarioComissionado funccom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", 10);
       funccom.setCargo("Vendedor");
       funccom.setSalBase(900);
       funccom.addVendas(1000);
       funccom.addVendas(3000);
       funccom.addVendas(4000);
          
       System.out.println("\n\nRegistro => " + funccom.getRegistro());
       System.out.println("Nome => " + funccom.getNome());
       System.out.println("Data admissão    => " + funccom.getDtAdmissao());
       System.out.println("Cargo    => " + funccom.getCargo());
       System.out.println("Salario Bruto    => " + (funccom.calcSalBruto()));
       System.out.println("Vendas   => " + (funccom.getTotalVendas()));
       System.out.println("Comissao => " + funccom.getTaxaComissao() + "%");
       System.out.println("Desconto => " + (funccom.calcDesconto()));
       System.out.println("Gratificacao => " + (funccom.calcGratificacao()));
       System.out.println("Salario Liquido  => " + (funccom.calcSalLiquido())); 
    }
    
}
