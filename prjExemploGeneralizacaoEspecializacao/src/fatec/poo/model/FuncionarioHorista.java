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
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public void apontarHoras(int qtdeHorTrab)   {
       this.qtdeHorTrab = qtdeHorTrab;
   }  

   public double calcSalBruto() {
           double salBruto;
           salBruto = this.valHorTrab *  this.qtdeHorTrab;
           return salBruto;
   }
   
   public double calcSalLiquido() {
        return super.calcSalLiquido() + this.calcGratificacao();
   }

   public double calcGratificacao() {
       return 0.075 * this.calcSalBruto(); 
   }
   
}
