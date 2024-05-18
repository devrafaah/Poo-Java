/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade4 {

    public static void main(String[] args) {
        String nome,turma;
        int quantidadeDeAlunos;
        float mensalidade, valorAcumulado;
        
        
        
        
        // pegando os dados que o usuario vai fornecer.
        nome = JOptionPane.showInputDialog("Digite o nome do curso");
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos do curso"));  
        turma = JOptionPane.showInputDialog("Digite qual é sua Turma");
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade do curso"));
        
        
        Curso c = new Curso();
        c.cadastraCurso(nome, quantidadeDeAlunos, turma, mensalidade);
        c.nome = nome;
        c.quantidadeDeAlunos = quantidadeDeAlunos;
        c.turma = turma;
        c.mensalidade = mensalidade;
        
        // nesse metodo ira retornar o valor total arrecado do curso 
        // em questao de alunos x mensalidade durante 1 mes de curso. 
        valorAcumulado = c.calculaTotalMensalidade(quantidadeDeAlunos, mensalidade);
        
        
        c.imprimeDados();
        JOptionPane.showMessageDialog(null, "Valor acumulado do curso de " +c.nome + " mensal corresponde a: R$ "+valorAcumulado);
        JOptionPane.showMessageDialog(null, "Adicionando outro Curso na grade curricular....");
        
        
        // pegando os dados que o usuario vai fornecer.
        nome = JOptionPane.showInputDialog("Digite o nome do curso");
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos do curso"));  
        turma = JOptionPane.showInputDialog("Digite qual é sua Turma");
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mensalidade do curso"));
        
        
        Curso c2 = new Curso();
        c2.cadastraCurso(nome, quantidadeDeAlunos, turma, mensalidade);
        c2.calculaTotalMensalidade(quantidadeDeAlunos, mensalidade);
        
        c2.nome = nome;
        c2.quantidadeDeAlunos = quantidadeDeAlunos;
        c2.turma = turma;
        c2.mensalidade = mensalidade;
        
        c2.imprimeDados();
        
        valorAcumulado = c.calculaTotalMensalidade(quantidadeDeAlunos, mensalidade);
        JOptionPane.showMessageDialog(null, "Valor acumulado do curso de " +c2.nome + " mensal corresponde a: R$ "+valorAcumulado);
    }
}
