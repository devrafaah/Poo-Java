/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade6_2 {

    public static void main(String[] args) {
        String nome, matricula;
        float vP[], valorProjeto, qtdeHoras, valorHora;
        int qtdProjetos;
        
        
        
        JOptionPane.showMessageDialog(null, "Cadastrando Analista, Insira os dados a seguir..");
        
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        matricula = JOptionPane.showInputDialog("Digite a sua matricula");
        qtdProjetos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos existentes"));
        vP = new float[qtdProjetos];
        
        for(int i=0 ; i < vP.length;i++){
            valorProjeto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do projeto " + (i+1)));
            vP[i] = valorProjeto;
        }
        
        Analista a1 = new Analista(nome, matricula, vP);
        
        JOptionPane.showMessageDialog(null, "Dados do Analista\nNome: "+a1.getNome()+"\nMatricula: "+a1.getMatricula()+"\nSalario: "+a1.calculaSalario());
        
        JOptionPane.showMessageDialog(null, "Cadastrando Programador, Insira os dados a seguir..");
        
        nome = JOptionPane.showInputDialog("Digite o nome do Programdor");
        matricula = JOptionPane.showInputDialog("Digite a sua matricula");
        qtdeHoras = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhada"));
        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor/Hora do seu trabalho"));
        
        Programador p1 = new Programador(nome,matricula,qtdeHoras,valorHora);
        
        JOptionPane.showMessageDialog(null, "Dados do Programador\nNome: "+p1.getNome()+"\nMatricula: "+p1.getMatricula()+"\nTrabalho/Hora: "+p1.getQtdeHoras()+"\nValor/Hora: "+p1.getValorHora()+"\nSalario: "+p1.calculaSalario());
        
    }
}
