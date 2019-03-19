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
public class QuartoHotel {
    private int NumQuarto;
    private double ValorDiaria;
    private int NumRG;
    private boolean Situacao;
    private double TotalFaturado;

    public QuartoHotel(int NumQuarto, double ValorDiaria) {
        this.NumQuarto = NumQuarto;
        this.ValorDiaria = ValorDiaria;
        this.TotalFaturado = 0;
        this.Situacao = false; //Quarto livre
    }
    
    public void reservar(int nRG) {
        if (this.Situacao == false) { // se o quarto estiver
            this.NumRG = nRG;
            this.Situacao = true; //Quarto ocupado
        }
    }
    
    public double liberar(int nDias) {
        this.NumRG = 0;
        this.Situacao = false;
        double vPgto = nDias * this.ValorDiaria;
        this.TotalFaturado += vPgto;
        return vPgto;
    }

    public boolean getSituacao() {
        return Situacao;
    }

    public double getTotalFaturado() {
        return TotalFaturado;
    }
    
    
}
