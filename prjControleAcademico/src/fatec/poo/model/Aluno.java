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
public class Aluno extends Pessoa {
    private String ra;
    private int escolaridade;

    public Aluno(String ra, String Nome) {
        super(Nome);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public int getEscolaridade() {
        return escolaridade;
    }
    
    
}
