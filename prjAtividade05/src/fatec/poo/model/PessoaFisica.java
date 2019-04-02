/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author WLLR9505
 */
public class PessoaFisica extends Pessoa {
    private String CPF;
    private double Base;

    public PessoaFisica(String CPF, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CPF = CPF;
    }
    
    public double calcBonus(int ano) {
        if (super.getTotalCompras() > 12000) {
            return (ano - super.getAnoInscricao()) * this.Base;
        } else {
            return 0;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    public double getBase() {
        return Base;
    }
    
    
}
