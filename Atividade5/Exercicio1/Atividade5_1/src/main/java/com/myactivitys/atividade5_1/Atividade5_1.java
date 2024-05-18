/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade5_1 {

    public static void main(String[] args) {
        int cracha, tempo;
        String cargo;
        float salario;
        
        cracha = Integer.parseInt(JOptionPane.showInputDialog("Informe seu cracha"));
        cargo = JOptionPane.showInputDialog("Digite o seu cargo de trabalho");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu salario atualmente"));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de contribuição de trabalho atualmente ( anos )"));
        Funcionario f1 = new Funcionario();
        
        f1.setCracha(cracha);
        f1.setCargo(cargo);
        f1.setSalario(salario);
        
        // aumento salarial de 10%
        f1.calculaAumento(10f);
        
        // tempo de contribuição de trabalho na empresa
        f1.calculaAumento(tempo);
        
        
        // resultado do formulario do Funcionario dentro da empresa
        // de acordo com nossos sistemas...
        System.out.println("|--------------------------------");
        System.out.println("| Cracha ID: "+f1.getCracha());
        System.out.println("| Cargo: "+f1.getCargo());
        System.out.println("| Salario: "+f1.getSalario());
        System.out.println("| Tempo de contribuição: "+tempo);
        System.out.println("|--------------------------------");
    }
}
