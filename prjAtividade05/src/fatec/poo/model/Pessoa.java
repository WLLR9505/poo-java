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
public abstract class Pessoa {
    private String Nome;
    private int AnoInscricao;
    private double TotalCompras;

    public Pessoa(String Nome, int AnoInscricao) {
        this.Nome = Nome;
        this.AnoInscricao = AnoInscricao;
    }
       
    abstract public double calcBonus(int ano);
    
    public void addCompras(double valorCompra) {
       this.TotalCompras += valorCompra;
    }
    
    public String getNome() {
        return Nome;
    }

    public int getAnoInscricao() {
        return AnoInscricao;
    }

    public double getTotalCompras() {
        return TotalCompras;
    }
    
}
