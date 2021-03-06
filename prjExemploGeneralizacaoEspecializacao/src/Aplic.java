
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.Projeto;
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
        
        Departamento d1 = new Departamento("ADM", "Administração");
        Departamento d2 = new Departamento("VD", "Vendas");
        Departamento d3 = new Departamento("TI", "Departamento de TI");
        Projeto p1 = new Projeto(01, "Projeto Teste");
        p1.setDataInicio("09/04/2019");
        p1.setDataTermino("09/05/2019");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80); 
        funcHor.setCargo("Programador");
        funcHor.setDepartamento(d3);
        funcHor.setProjeto(p1);
        funcHor.apontarHoras(90);
        System.out.println("\n\nRegistro => " + funcHor.getRegistro());
        System.out.println("Nome => " + funcHor.getNome());
        System.out.println("Data admissão    => " + funcHor.getDtAdmissao());
        System.out.println("Cargo    => " + funcHor.getCargo());
        System.out.println("Departamento   =>  " + funcHor.getDepartamento().getNome());
        
        System.out.println("Salario Bruto    =>  " +  funcHor.calcSalBruto());
        System.out.println("Desconto          =>  " +  funcHor.calcDesconto());
        System.out.println("Salario Liquido  =>  " + funcHor.calcSalLiquido());
        System.out.println("Gratificacao    =>  " + funcHor.calcGratificacao());

        FuncionarioMensalista funcMen = new FuncionarioMensalista(1011, "Leandro Alves", "15/12/19790", 2.5);
        funcMen.setCargo("Aux. Administrativo");
        funcMen.setDepartamento(d1);
        funcMen.setProjeto(p1);
        funcMen.apontarValSalMin(998);
        System.out.println("\n\nRegistro => " + funcMen.getRegistro());
        System.out.println("Nome => " + funcMen.getNome());
        System.out.println("Data admissão    => " + funcMen.getDtAdmissao());
        System.out.println("Cargo    => " + funcMen.getCargo());
        System.out.println("Departamento   =>  " + funcMen.getDepartamento().getNome());

        System.out.println("Salario Bruto    =>  " +  funcMen.calcSalBruto());
        System.out.println("Desconto          =>  " +  funcMen.calcDesconto());
        System.out.println("Salario Liquido  =>  " + funcMen.calcSalLiquido());

         
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", 10);
        funcCom.setCargo("Vendedor");
        funcCom.setDepartamento(d2);
        funcCom.setProjeto(p1);
        funcCom.setSalBase(900);
        funcCom.addVendas(1000);
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);
        
        System.out.println("\n\nRegistro => " + funcCom.getRegistro());
        System.out.println("Nome => " + funcCom.getNome());
        System.out.println("Data admissão    => " + funcCom.getDtAdmissao());
        System.out.println("Cargo    => " + funcCom.getCargo());
        System.out.println("Departamento   =>  " + funcCom.getDepartamento().getNome());
        
        System.out.println("Salario Bruto    => " + (funcCom.calcSalBruto()));
        System.out.println("Vendas   => " + (funcCom.getTotalVendas()));
        System.out.println("Comissao => " + funcCom.getTaxaComissao() + "%");
        System.out.println("Desconto => " + (funcCom.calcDesconto()));
        System.out.println("Gratificacao => " + (funcCom.calcGratificacao()));
        System.out.println("Salario Liquido  => " + (funcCom.calcSalLiquido()));
        
        d3.addFuncionario(funcHor);
        d1.addFuncionario(funcMen);
        d2.addFuncionario(funcCom);
        
        
        
        p1.addFuncionario(funcCom);
        p1.addFuncionario(funcMen);
        p1.addFuncionario(funcHor);
        
        d1.listar();
        d2.listar();
        d3.listar();
        
        p1.listar();
    }
    
}
