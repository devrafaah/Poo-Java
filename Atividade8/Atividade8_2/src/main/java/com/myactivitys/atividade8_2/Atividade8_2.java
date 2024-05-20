/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade8_2;


import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade8_2 {

    public static void main(String[] args) {
        String nome, matricula;
        float qtdHora, vHora, vProj;
        
        
        
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        matricula = JOptionPane.showInputDialog("Digite a sua matricula");
        int qtdProj = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de projetos que você possui atualmente ?"));
        float[] projects = new float[qtdProj];
        
        JOptionPane.showMessageDialog(null,"A seguir informe o valor dos "+qtdProj+" projetos");
        
        for(int i = 0; i < qtdProj; i++){
            vProj = Float.parseFloat(JOptionPane.showInputDialog("O valor do Projeto: "+(i + 1)));
            projects[i] = vProj;
        }
        JOptionPane.showMessageDialog(null, "Adicionando seus dados ao sistema.....");
        
        
        Analista a1 = new Analista(nome,matricula, projects);
        JOptionPane.showMessageDialog(null, "Dados do Analista:\nNome: "+a1.getNome()+"\nMatricula: "+a1.getMatricula()+"\nQuantidade de Projetos: "+qtdProj+"\nSalario: "+a1.calculaSalario());
        
        JOptionPane.showMessageDialog(null, "Agora vamos cadastrar um Programador a seguir");
        
        nome = JOptionPane.showInputDialog("Digite o nome do Programador");
        qtdHora = Float.parseFloat(JOptionPane.showInputDialog("Qual sua quantidade de horas trabalhada"));
        matricula = JOptionPane.showInputDialog("Digite a sua matricula");
        vHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor hora trabalhada"));
        
        Programador p1 = new Programador(nome,matricula,qtdHora,vHora);
        
        JOptionPane.showMessageDialog(null, "Dados do Programador\nNome: "+p1.getNome()+"\nMatricula: "+p1.getMatricula()+"\nValor/Hora de trabalho: "+p1.getValorHora()+"\nQuantidade Hora de trabalho: "+p1.getQtdeHoras()+"\nSalario: "+p1.calculaSalario());
        
        JOptionPane.showMessageDialog(null, "FIM :D");
    }
}
