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
    private String nome;
    private String dtNascimento;
    private String endereco;
    private String Cidade;
      
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}