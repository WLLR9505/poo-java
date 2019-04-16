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
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
        
    public Professor(String regFunc, String nome){
        super(nome);
        this.regFunc = regFunc;        
    }

    public String getRegFunc() {
        return regFunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }

    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}