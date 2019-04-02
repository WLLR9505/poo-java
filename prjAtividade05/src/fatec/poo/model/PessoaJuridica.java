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
public class PessoaJuridica extends Pessoa {
    private String CGC;
    private double TaxaIncentivo;

    public PessoaJuridica(String CGC, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;
    }
    
    public double calcBonus(int ano) {
        return (this.TaxaIncentivo * super.getTotalCompras()) * (ano - super.getAnoInscricao());
    }

    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = TaxaIncentivo;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo;
    }
}
