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
public class Professor extends Pessoa {
    private String regfunc;
    private int titularidade;
    private int areaAtuacao;

    public Professor(String regfunc, int areaAtuacao, String Nome) {
        super(Nome);
        this.regfunc = regfunc;
        this.areaAtuacao = areaAtuacao;
    }

    public String getRegfunc() {
        return regfunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }
    
    
}
