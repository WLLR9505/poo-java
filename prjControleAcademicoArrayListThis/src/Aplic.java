/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Professor;
import fatec.poo.model.Turma;


/**
 *
 * @author WLLR9505
 */
public class Aplic {
    public static void main(String[] args) {
       Curso curso = new Curso("LNX", "Introdução a Linux", "8 horas semanais");
       
       Professor prof1 = new Professor("123", "Jonathan");
       Turma turma1 = new Turma("LNX02", 15);              
       
       Aluno aluno1 = new Aluno("001", "Ricardo");
       Aluno aluno2 = new Aluno("002", "Luan");
       Aluno aluno3 = new Aluno("003", "Alice");
       Aluno aluno4 = new Aluno("004", "Ana");
       Aluno aluno5 = new Aluno("005", "Viktor");
       
       turma1.setCurso(curso);
       turma1.setProfessor(prof1);
       turma1.addAluno(aluno1);
       turma1.addAluno(aluno2);
       turma1.addAluno(aluno3);
       turma1.addAluno(aluno4);
       turma1.addAluno(aluno5);
        //Curso <-> Turma
       turma1.listarAlunos();       
    }    
}
