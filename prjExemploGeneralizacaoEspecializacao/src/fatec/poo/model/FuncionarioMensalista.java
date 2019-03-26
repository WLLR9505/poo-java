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
public abstract class FuncionarioMensalista extends Funcionario {
   private double valSalMin;
   private double numSalMin;

    public FuncionarioMensalista(double numSalMin, int registro, String nome, String dtAdmissao) {
        super(registro, nome, dtAdmissao);
        this.numSalMin = numSalMin;
    }
   
    public void apontarValSalMin(double valSalMin) {
        this.valSalMin = valSalMin;
    }
   
    public double calcSalBruto() {
        double salBruto;
        salBruto = this.valSalMin * this.numSalMin;
        return salBruto;
    }
}
