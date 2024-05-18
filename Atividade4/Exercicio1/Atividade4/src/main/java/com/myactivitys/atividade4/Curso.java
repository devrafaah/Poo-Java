/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Curso {
    String nome;
    int quantidadeDeAlunos;
    String turma;
    float mensalidade;
    
    public Curso(){}
    
    public Curso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadeDeAlunos = q;
        this.turma = t;
        this.mensalidade = m;
    }
    public void cadastraCurso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadeDeAlunos = q;
        this.turma = t;
        this.mensalidade = m;
    }
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,"Informações sobre o curso\nNome Do Curso: "+nome +"\nQuantidade de Alunos no Curso: "+quantidadeDeAlunos+"\nTurma: "+turma+"\nMensalidade do curso: "+mensalidade,"INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
    }
    public float calculaTotalMensalidade(int q, float m){
        return q * m;
    }
}
