/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author WLLR9505
 */
public class Projeto {
    private int codigo;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }
 
    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
        f.setProjeto(this);
    }
    
    public void listar() {
        System.out.println("\n\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Inicio: " + dataInicio);
        System.out.println("Data de termino: " + dataTermino);
        System.out.println("Qtde. Funcionários: " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\t\tCargo\t\tDepartamento");
        
        for(int x =0; x < funcionarios.size();x++){
            System.out.print(funcionarios.get(x).getRegistro());
            System.out.print("\t\t" + funcionarios.get(x).getNome());
            System.out.print("\t\t" + funcionarios.get(x).getCargo());                        
            System.out.println("\t\t" + funcionarios.get(x).getDepartamento().getNome());
        }
    }
}
