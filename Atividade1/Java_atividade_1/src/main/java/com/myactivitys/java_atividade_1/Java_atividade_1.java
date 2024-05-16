/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.java_atividade_1;

/**
 *
 * @author MobDi
 */
public class Java_atividade_1 {

    public static void main(String[] args) {
        
        // alternativa 1 
        Curso c = new Curso();
        Cliente cc = new Cliente();
        
        
        // alternativa 2
        // Curso cc;
        // cc = new Curso();
        
        
        c.nome_curso = "Programacao Orientada a Objetos";
        c.valor_curso = 2500.00;
        c.qtd_alunos = 500;
        c.qtd_aulas = 20;
        
        cc.nome = "Gilberto";
        cc.sobrenome = "Luiz";
        cc.idade = 42;
        cc.valorGasto = 3450.99;
        
        
        
        
        
        System.out.println("Nome do Curso: " + c.nome_curso);
        System.out.println("Valor do Curso: " + c.valor_curso + " reais");
        System.out.println("Quantidade de Alunos: " + c.qtd_alunos + " alunos");
        System.out.println("Quantidade de Aulas: " + c.qtd_aulas + " aulas");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Nome do Cliente: " + cc.nome);
        System.out.println("Sobrenome do Cliente: " + cc.sobrenome);
        System.out.println("Idade do Cliente: " + cc.idade + " anos");
        System.out.println("Valor Gasto do Cliente: " + cc.valorGasto + " dolares");
        
        
    }
}
