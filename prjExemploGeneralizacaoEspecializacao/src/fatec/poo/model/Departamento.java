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
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int qtdFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.qtdFunc = 0; //redundância, valor auto iniciado em zero
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f) {
        this.funcionarios[this.qtdFunc++] = f;   //o incremento com '++' a direita é feito depois da funcao
    }
    
    public void listar() {
        System.out.println("SIGLA " + this.sigla);
        System.out.println("Nome " + this.nome);
        System.out.println("Quantidade funcionarios " + this.qtdFunc);
        System.out.println("\n\nRegistro\t\tNome\t\t");
        
        for (int x = 0; x < qtdFunc; x++) {
            System.out.println(this.funcionarios[x].getRegistro()+ "\t\t" + this.funcionarios[x].getNome() + "\t\t");
            if (this.funcionarios[x] instanceof FuncionarioHorista) {
                System.out.println("Horista");
            } else if (this.funcionarios[x] instanceof FuncionarioMensalista) {
                System.out.println("Mensalista");
            } else if (this.funcionarios[x] instanceof FuncionarioComissionado){
                System.out.println("Comissionado");
            }
        }
    }
}
