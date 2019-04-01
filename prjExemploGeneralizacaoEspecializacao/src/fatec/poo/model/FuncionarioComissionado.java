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
public class FuncionarioComissionado extends Funcionario {
    private double SalBase ;
    private double TaxaComissao;
    private double TotalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double SalBase, double TaxaComissao, double TotalVendas) {
        super(registro, nome, dtAdmissao);
        this.SalBase = SalBase;
        this.TaxaComissao = TaxaComissao;
        this.TotalVendas = TotalVendas;
    }

    public double getSalBase() {
        return SalBase;
    }

    public double getTaxaComissao() {
        return TaxaComissao;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setSalBase(double SalBase) {
        this.SalBase = SalBase;
    }
    
    public void addVendas(double vVenda) {
        this.TotalVendas += vVenda;
    }
    
    //public double calcGratificacao() {
       // if (this.TotalVendas > 5000 && this.TotalVendas <= 10000) {
         //   this.
       //}
    //}
    
    //public double calcSalLiquido() {
        //return super.calcSalBruto() - super.calcDesconto() + this.calcGratificacao();
   //}
    
    public double calcSalBruto() {
        double salBruto;
        salBruto = this.SalBase + this.TaxaComissao * this.TotalVendas;
        return salBruto;
    }
    
}
