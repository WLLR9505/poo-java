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
public class Pessoa {
    private String Nome;
    private String dtNascimento;
    private String endereco;
    private String cidade;

    public Pessoa(String Nome) {
        this.Nome = Nome;
    }        
    public String getNome() {
        return Nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }
    
    
}
