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
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
        f.setDepartamento(this);
    }
    
    public void listar(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome : " + nome);
        System.out.println("Qtde. funcionários : " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\tCargo\t\tTipo");
        
        for(int x=0; x < funcionarios.size(); x++){
            System.out.print(funcionarios.get(x).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(x).getNome() + "\t\t");
            System.out.print(funcionarios.get(x).getCargo() + "\t");
            
            if (funcionarios.get(x) instanceof FuncionarioHorista){
                System.out.println("Horista");
            }else
                if (funcionarios.get(x) instanceof FuncionarioMensalista){
                    System.out.println("Mensalista");
                }else{
                    System.out.println("Comissionado");
                }
        }
        
    }
}
