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
public class Projeto {
    private int codigo;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private Funcionario[] funcionarios;
    private int qtdFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdFunc = 0;
        this.funcionarios = new Funcionario[10];
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
        this.funcionarios[this.qtdFunc++] = f;
    }
    
    public void listar() {
        System.out.println("\n\nCodigo: " + this.codigo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Data de Inicio: " + this.dataInicio);
        System.out.println("Data de Termino: " + this.dataTermino);
        System.out.println("Quantidade de Funcionarios: " + this.qtdFunc);
        
        System.out.println("Resgisto\tNome\t\tCargo\t\t\t\tDepartamento");
        for (int i = 0; i < this.qtdFunc; i++) {
            System.out.print(this.funcionarios[i].getRegistro()+ "\t\t" + this.funcionarios[i].getNome() + "\t");
            System.out.println(this.funcionarios[i].getCargo() + "\t\t\t" + this.funcionarios[i].getDepartamento().getNome());
        }
    }
}
