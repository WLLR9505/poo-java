
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

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
           
    }
    
}
